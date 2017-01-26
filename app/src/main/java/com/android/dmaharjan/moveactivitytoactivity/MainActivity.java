package com.android.dmaharjan.moveactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNextActivity(View view) {
        Intent intent= new Intent(this,NextActivity.class);
        EditText nameTv=(EditText) findViewById(R.id.name);
        String name=nameTv.getText().toString();
        intent.putExtra("name",name);
        startActivity(intent);
    }
}
