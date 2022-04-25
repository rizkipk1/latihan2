package com.rizkiputrakencana.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button buttonLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editusername);
        password = (EditText) findViewById(R.id.editpassword);
        buttonLogin = (Button) findViewById(R.id.loginbut);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey= username.getText().toString();
                String passwordKey= password.getText().toString();

                if (usernameKey.equals("kiki")&& passwordKey.equals("12345") ){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),"login sukses", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MainActivity.this,welcomeactivity.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau passwod anda salah")
                            .setNegativeButton("Retry",null).create().show();
                }

            }
        });
    }
}