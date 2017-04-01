package me.yoniffafan.android.kerangajaib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent i = getIntent();
        String text = i.getStringExtra ("TextBox");
// Now set this value to EditText
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText ( text );

    }
}
