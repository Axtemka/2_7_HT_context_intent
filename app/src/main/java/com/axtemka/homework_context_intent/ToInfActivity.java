package com.axtemka.homework_context_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class ToInfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_inf);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView tv = findViewById(R.id.tv);
        String str = getIntent().getStringExtra("text");
        tv.setText(str);
    }
}