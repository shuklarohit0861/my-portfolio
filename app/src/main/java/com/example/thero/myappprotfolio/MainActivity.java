package com.example.thero.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View view)
    {
        Button button = (Button)view;
        String buttonText = button.getText().toString();
        switch (buttonText)
        {
            case "popular Movies":
                Toast.makeText(this,"The button will launch my Popular Movies app",Toast.LENGTH_LONG).show();
                break;
            case "stock hawk":
                Toast.makeText(this,"The button will launch my Stock Hawk app!",Toast.LENGTH_LONG).show();
                break;
            case "build it bigger":
                Toast.makeText(this,"This button will launch my Build it bigger app!",Toast.LENGTH_LONG).show();
                break;
            case "make your app material":
                Toast.makeText(this,"this button will lauch my Make your app material app!",Toast.LENGTH_LONG).show();
                break;
            case "go ubiquitous":
                Toast.makeText(this,"this button will launch my Go Ubiquitous app!",Toast.LENGTH_LONG).show();
                break;
            case "capstone":
                Toast.makeText(this,"this button will launch my Capstone app!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
