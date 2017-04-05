package com.glaniewski.com.istatusarduinoproject;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.bluetooth.BluetoothAdapter;
import android.widget.Toast;

/**
 * Created by pc on 3/28/2017.
 */

public class SecondActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.USER_NAME);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.infoCard);
        textView.setText("Signed in as: " + name);

        final Button button = (Button) findViewById(R.id.display);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.phrase);

                Toast.makeText(getApplicationContext(), "Sent to display", Toast.LENGTH_SHORT).show();
                editText.setText("");
            }
        });
    }
}
