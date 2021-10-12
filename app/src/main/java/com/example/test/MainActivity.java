package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);

        Button button = findViewById(R.id.button);
         TextView editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.flight2);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String package_name = "us.zoom.videomeetings";
                String activity_path = "com.zipow.videobox.LauncherActivity";
                Intent intent = new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//可选
                ComponentName comp = new ComponentName(package_name, activity_path);
                intent.setComponent(comp);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String package_name = "com.microsoft.teams";
                String activity_path = "com.microsoft.skype.teams.Launcher";
                Intent intent = new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);//可选
                ComponentName comp = new ComponentName(package_name, activity_path);
                intent.setComponent(comp);
                startActivity(intent);
            }
        });



        editTextTextPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length() != 0)
                    imageView.setImageResource(R.drawable.flight2);
                else
                    imageView.setImageResource(R.drawable.flight);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }



}