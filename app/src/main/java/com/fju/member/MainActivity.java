package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showname;
    private TextView showage;
    private TextView showgender;
    public Button button;
    private Intent intentuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showname = findViewById(R.id.nickname);
        showgender = findViewById(R.id.gender);
        showage = findViewById(R.id.age);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentuser = new Intent(MainActivity.this, NicknameActivity.class);
                startActivity(intentuser);
            }
        });




    }


}
