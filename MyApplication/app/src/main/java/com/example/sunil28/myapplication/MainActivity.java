package com.example.sunil28.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void DisplayInfo(View view) {
        EditText name = (EditText) findViewById(R.id.editTextName);
        String nameAsString = name.getText().toString();
        Log.i("Info", nameAsString);
        Toast.makeText(this, "Welcome "+nameAsString+"..!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
