package com.shovo.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private  static PrefConfig prefConfig;
    private Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prefConfig =new PrefConfig(SecondActivity.this);

        logout=findViewById(R.id.logutId);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prefConfig.writeloginestatus(false);


                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
