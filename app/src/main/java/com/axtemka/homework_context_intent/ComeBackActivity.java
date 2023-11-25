package com.axtemka.homework_context_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComeBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_back);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView et = findViewById(R.id.editText);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button bt = findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("et",et.getText().toString());
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}