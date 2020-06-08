package com.nachiket.cqtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignupActivity extends AppCompatActivity {

    TextInputEditText userName, passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        userName = findViewById(R.id.et_username);
        passWord = findViewById(R.id.et_password);
    }

    public void BtnClick(View view) {
        final String un = userName.getText().toString();
        final String pw = passWord.getText().toString();
        if (un.equals("")) {
            Toast.makeText(SignupActivity.this, "Enter valid username", Toast.LENGTH_SHORT).show();
        }
        if (pw.equals("")) {
            Toast.makeText(SignupActivity.this, "Enter valid password", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(SignupActivity.this, "Account created", Toast.LENGTH_SHORT).show();
    }

    public void TvClick(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
//    Button signup = (Button) findViewById(R.id.btn_login);
//        signup.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//final String un = userName.getText().toString();
//final String pw = passWord.getText().toString();
//        if (un.equals("")) {
//        Toast.makeText(SignupActivity.this, "Enter valid username", Toast.LENGTH_SHORT).show();
//        }
//        if (pw.equals("")) {
//        Toast.makeText(SignupActivity.this, "Enter valid password", Toast.LENGTH_SHORT).show();
//        }
//        Toast.makeText(SignupActivity.this, "Account created", Toast.LENGTH_SHORT).show();
//        }
//        });
//
//        TextView loginTv = (TextView) findViewById(R.id.tv_to_signup);
//        loginTv.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        startActivity(new Intent(getApplicationContext(), MainActivity.class));
//        }
//        });