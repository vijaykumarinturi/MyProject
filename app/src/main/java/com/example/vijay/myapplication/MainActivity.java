package com.example.vijay.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t =(TextView)findViewById(R.id.id_tv);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "firstddd application d", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "kjhh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
