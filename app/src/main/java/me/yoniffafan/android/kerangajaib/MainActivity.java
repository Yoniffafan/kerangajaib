package me.yoniffafan.android.kerangajaib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showResult(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        String[] messages = {editText1.getText().toString(),editText2.getText().toString()};
        Random random = new Random();
        int index = random.nextInt(messages.length);


        Intent intent = new Intent ( MainActivity.this, HasilActivity.class );
        String message = messages[index];
        intent.putExtra ( "TextBox", message);
        startActivity(intent);
    }
}
