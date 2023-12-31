package com.example.feedconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeBoard extends AppCompatActivity {

    Button buttonUser, buttonOwner, buttonAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_board);

        buttonUser = findViewById(R.id.userBtn);
        buttonOwner = findViewById(R.id.coBtn);
        buttonAdmin = findViewById(R.id.adminBtn);

        buttonUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login2.class);
                startActivity(intent);
                finish();
            }
        });

        buttonOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OwnerLogin.class);
                startActivity(intent);
                finish();
            }
        });

        buttonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdminLogin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}