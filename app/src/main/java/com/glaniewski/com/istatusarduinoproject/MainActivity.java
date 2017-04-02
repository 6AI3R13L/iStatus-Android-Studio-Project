package com.glaniewski.com.istatusarduinoproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    public static final String USER_NAME = "com.glaniewski.iStatusArduinoProject.USER_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Called when user taps the Next button **/

        final Button button = (Button) findViewById(R.id.next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                EditText editText = (EditText) findViewById(R.id.name);
                String userName = editText.getText().toString();
                intent.putExtra(USER_NAME, userName);
                startActivity(intent);
            }
        });
    }
}
