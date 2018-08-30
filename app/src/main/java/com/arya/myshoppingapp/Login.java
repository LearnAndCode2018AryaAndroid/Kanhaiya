package com.arya.myshoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button login;
EditText email1,password1;
String e1,p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email1 = (EditText) findViewById(R.id.et5);
        password1 = (EditText) findViewById(R.id.et6);
        login= (Button)findViewById(R.id.b4);
        final Intent intent=new Intent(getApplicationContext(), Home.class);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1=email1.getText().toString();
                p1=password1.getText().toString();

                if(TextUtils.isEmpty(e1)||e1.equals(null))
                {
                    Toast.makeText(Login.this,"Email field is empty",Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(p1)||p1.equals(null))
                {
                    Toast.makeText(Login.this,"Password field is empty",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    startActivity(intent);
                }
            }
        });

    }
}
