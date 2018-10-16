package com.example.adk2266.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cjq9715 extends AppCompatActivity {

    @Override
    private Button back_main;
    private Button event1;
    private Button event2;
    private Button event3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back_main = (Button)findViewById(R.id.back_main);
        back_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {MainActivity();
            }
        });
        event1 = (Button)findViewById(R.id.back_main);
        event1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {editevent();
            }
        });
        event2 = (Button)findViewById(R.id.back_main);
        event2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {editevent();
            }
        });
        event3 = (Button)findViewById(R.id.back_main);
        event3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {editevent();
            }
        });
    }
    public void MainActivity() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void editevent() {
        Intent intent = new Intent(this,editevent.class);
        startActivity(intent);
}
