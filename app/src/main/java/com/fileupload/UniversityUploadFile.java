package com.fileupload;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;

import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import android.annotation.SuppressLint;
import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.Toast;

import com.fileupload.path.chooser.PathFinder;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UniversityUploadFile extends AppCompatActivity{

    EditText user, pass;
    Button login, not_reg;
    DatabaseHandler db;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_upload_file);

        user =(EditText)findViewById(R.id.eduser);
        pass = (EditText)findViewById(R.id.edpass);
        login =(Button)findViewById(R.id.login);
        not_reg =(Button)findViewById(R.id.not_reg);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                db=new DatabaseHandler(UniversityUploadFile.this, null, null, 2);
                String username=user.getText().toString();
                String password= pass.getText().toString();

                String StoredPassword =db.getregister(username);
                if(password.equals(StoredPassword)){
                    Intent i =new Intent(UniversityUploadFile.this,HomeActivity.class);
                    Toast.makeText(getApplicationContext(), StoredPassword+"Login Successfully", Toast.LENGTH_LONG).show();
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                }


            }
        });

        not_reg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                Intent i = new Intent(UniversityUploadFile.this,SignupActivity.class);
                startActivity(i);
            }
        });





    }

}