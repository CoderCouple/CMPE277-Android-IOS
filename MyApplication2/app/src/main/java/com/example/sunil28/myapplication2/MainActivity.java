package com.example.sunil28.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void displayImg(View view) {

        ImageView img = (ImageView) findViewById(R.id.imageViewNaruto);
        img.setImageResource(R.drawable.saske);
        Log.i("Info : ", "Button Clicked...!!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
