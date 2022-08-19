package com.example.week2practicalredo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MessageButton = findViewById(R.id.MessageButton);
        Button FollowButton = findViewById(R.id.FollowButton);
        User NewUser = new User();
        NewUser.setName("Practical 3");
        NewUser.setDesc("Hardcoded description for practical 3");
        NewUser.setFollowed(false);
        TextView NameView = findViewById(R.id.nameView);
        TextView DescView = findViewById(R.id.descView);

        MessageButton.setText("Message");
        FollowButton.setText("Follow");
        NameView.setText(NewUser.getName());
        DescView.setText(NewUser.getDesc());

        FollowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (NewUser.isFollowed()){
                    NewUser.setFollowed(false);
                    FollowButton.setText("Follow");
                    Toast.makeText(MainActivity.this,"UnFollowed user!", Toast.LENGTH_SHORT).show();

                }
                else{
                    NewUser.setFollowed(true);
                    FollowButton.setText("UnFollow");
                    Toast.makeText(MainActivity.this,"Followed user!", Toast.LENGTH_SHORT).show();



                }

            }
        });




    }
}