package com.example.acer.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mybutton = (Button) findViewById(R.id.button);
        mybutton.setOnClickListener(this);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                Intent i=new Intent (MainActivity.this, SecondActivity.class);
                startActivity(i);
        }
    }

}
