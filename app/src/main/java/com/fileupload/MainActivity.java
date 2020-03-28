package com.fileupload;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class MainActivity extends AppCompatActivity {
    EditText user, pass;

    FloatingActionButton log;

    JSONArray jarr = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.et_UserName);
        pass = (EditText) findViewById(R.id.et_Password);
        log = (FloatingActionButton) findViewById(R.id.rmob);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals("admin") && (pass.getText().toString().equals("1234"))) {

                    //Toast.makeText(getApplicationContext(), "Please Enter usename or password", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, UniversityUploadFile.class);
                    startActivity(intent);
                }
            }
        });
    }
}