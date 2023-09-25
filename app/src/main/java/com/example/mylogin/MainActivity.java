package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_login_main=(Button) findViewById(R.id.btnlogin_main);
        Button btn_signup_main=(Button) findViewById(R.id.btnsignup_main);

        btn_login_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_login);
                TextView usename=(TextView) findViewById(R.id.edtuser);
                TextView password=(TextView) findViewById(R.id.edtpass);
                Button btn_login_login=(Button) findViewById(R.id.btnlogin_login);

                btn_login_login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (usename.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                            Toast.makeText(MainActivity.this, "successfull", Toast.LENGTH_SHORT).show();
                            setContentView(R.layout.activity_login);
                        }else
                            Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        btn_signup_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_signup);
            }
        });
    }
}