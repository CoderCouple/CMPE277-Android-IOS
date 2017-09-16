package com.example.sunil28.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int secretNumber;

    public void guessTheNumber(View view) {
        EditText numberEditText = (EditText) findViewById(R.id.editText1);
        int number = Integer.parseInt(numberEditText.getText().toString());

        if (number > 20)
            Toast.makeText(this, "Sorry! Number grater that 20. Enter Again.", Toast.LENGTH_SHORT).show();

        if (number < 1)
            Toast.makeText(this, "Sorry! Number less that 1. Enter Again.", Toast.LENGTH_SHORT).show();

        if (number == secretNumber)
            Toast.makeText(this, "Hola! you got it...!!!", Toast.LENGTH_SHORT).show();
        else if (number < secretNumber)
            Toast.makeText(this, "higher !!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "Lower !!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random rand = new Random();
        secretNumber = rand.nextInt(20) + 1;
    }
}
