package com.example.week2practicalredo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView profileImg = findViewById(R.id.ProfileView);
        profileImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //alert
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(false);
                builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id){
                        Intent myIntent = new Intent(ListActivity.this, MainActivity.class);
                        startActivity(myIntent);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int id){
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }

        });

    }
}