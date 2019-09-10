package com.example.fall19_assignment_1_bellae_vcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button unlock = (Button) findViewById(R.id.unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }

    private void goToSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
