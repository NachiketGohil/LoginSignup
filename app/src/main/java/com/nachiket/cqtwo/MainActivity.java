package com.nachiket.cqtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText userName, passWord, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.et_username);
        passWord = findViewById(R.id.et_password);
        email = findViewById(R.id.et_email);
    }

    public void BtnClick(View view) {
        final String un = userName.getText().toString();
        final String pw = passWord.getText().toString();
        final String em = email.getText().toString();
        if (un.equals("")) {
            Toast.makeText(MainActivity.this, "Enter valid username", Toast.LENGTH_SHORT).show();
        }
        if (em.equals("")) {
            Toast.makeText(MainActivity.this, "Enter valid email", Toast.LENGTH_SHORT).show();
        }
        if (pw.equals("")) {
            Toast.makeText(MainActivity.this, "Enter valid password", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(MainActivity.this, "You are logged in", Toast.LENGTH_SHORT).show();
    }

    public void TvClick(View view) {
        startActivity(new Intent(getApplicationContext(), SignupActivity.class));
    }
}
//    Button button = (Button) findViewById(R.id.btn_login);
//        button.setOnClickListener(new View.OnClickListener() {
//public void onClick(View v) {
//final String un = userName.getText().toString();
//final String pw = passWord.getText().toString();
//final String em = email.getText().toString();
//        if (un.equals("")) {
//        Toast.makeText(MainActivity.this, "Enter valid username", Toast.LENGTH_SHORT).show();
//        }
//        if (em.equals("")) {
//        Toast.makeText(MainActivity.this, "Enter valid email", Toast.LENGTH_SHORT).show();
//        }
//        if (pw.equals("")) {
//        Toast.makeText(MainActivity.this, "Enter valid password", Toast.LENGTH_SHORT).show();
//        }
//        Toast.makeText(MainActivity.this, "You are logged in", Toast.LENGTH_SHORT).show();
//        }
//        });
//
//        TextView signup = (TextView) findViewById(R.id.tv_to_signup);
//        signup.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        startActivity(new Intent(getApplicationContext(), SignupActivity.class));
//        }
//        });