package com.arya.myshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
     EditText name,email,password,c_password;
     String n,e,p,cp;
    Button signin;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name = (EditText) findViewById(R.id.et1);
         email = (EditText) findViewById(R.id.et2);
         password = (EditText) findViewById(R.id.et3);
         c_password= (EditText) findViewById(R.id.et4);
        signin=(Button)findViewById(R.id.b3);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = name.getText().toString();
                e = email.getText().toString();
                p = password.getText().toString();
                cp = c_password.getText().toString();
                Intent i = new Intent(getApplicationContext(), Login.class);

                if (TextUtils.isEmpty(n) || n.equals(null)) {
                    Toast.makeText(Signup.this, "name field is empty", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(e) || e.equals(null)) {
                    Toast.makeText(Signup.this, "email field is empty", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(p) || p.equals(null)) {
                    Toast.makeText(Signup.this, "password field is empty", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(cp) || cp.equals(null)) {
                    Toast.makeText(Signup.this, "confirm password field is empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(i);
                }
            }
        });


    }
}
