package com.fileupload;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class ServiceMenu extends AppCompatActivity {

    CardView infoVenus,infoHiTech,infoMacro,infoTrue;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_menu);

        infoVenus = (CardView)findViewById(R.id.infoVenus);
        infoHiTech = (CardView)findViewById(R.id.infoHiTech);
        infoMacro = (CardView)findViewById(R.id.infoMacro);
        infoTrue = (CardView)findViewById(R.id.infoTrue);

        infoVenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle(R.string.dialog_title_venus);
                builder.setMessage("No:16, Annai Sathya Nagar, Ramapuram, Chennai - 89")
                        .setCancelable(false)
                        .setPositiveButton("Get Directions", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", 13.0319678,80.1709157);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                Toast.makeText(getApplicationContext(),"getting Directions",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Call", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                Toast.makeText(getApplicationContext(),"you choose Call action",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Contact Us");
                alert.show();
            }

        });
        infoHiTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle(R.string.dialog_title_venus);
                builder.setMessage("No: 209, VGP Nagar, Chennai - 37")
                        .setCancelable(false)
                        .setPositiveButton("Get Directions", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", 13.0843452,80.1766624);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                Toast.makeText(getApplicationContext(),"getting Directions",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Call", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose Call action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Contact Us");
                alert.show();
            }

        });
        infoMacro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle(R.string.dialog_title_venus);
                builder.setMessage("No: 4, Nehuru Nagar, Chennai - 44")
                        .setCancelable(false)
                        .setPositiveButton("Get Directions", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", 13.0206357,80.1839391);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                Toast.makeText(getApplicationContext(),"getting Directions",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Call", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose Call action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Contact Us");
                alert.show();
            }

        });
        infoTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle(R.string.dialog_title_venus);
                builder.setMessage("Baba Nagar, Villivakam, Chennai - 48")
                        .setCancelable(false)
                        .setPositiveButton("Get Directions", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", 13.0562501,80.1937157);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                Toast.makeText(getApplicationContext(),"getting Directions",
                                        Toast.LENGTH_SHORT).show();
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Call", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose Call action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Contact Us");
                alert.show();
            }

        });
    }
}
