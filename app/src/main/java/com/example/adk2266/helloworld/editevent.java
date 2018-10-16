package com.example.adk2266.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editevent extends AppCompatActivity {

    @Override
    private Button back_select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cjq9715);

        back_select = (Button)findViewById(R.id.back_select);

        back_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { cjq9715();
            }
        });
    }
    public void cjq9715() {
        Intent intent = new Intent(this,cjq9715.class);
        startActivity(intent);
    }
}
