package com.shovo.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private PrefConfig prefConfig;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefConfig =new  PrefConfig(MainActivity.this);
        login=findViewById(R.id.loginId);

        if (  prefConfig.redLoginStatus()){
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
            finish();


        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefConfig.writeloginestatus(true);

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
