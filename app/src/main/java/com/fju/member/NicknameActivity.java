package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText name;
    Button nextage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);

        name = findViewById(R.id.nickname);
        nextage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentage = new Intent(NicknameActivity.this, AgeActivity.class);
                intentage.putExtra("user name", name.getText().toString());
                startActivity(intentage);
            }
        });

    }
}
