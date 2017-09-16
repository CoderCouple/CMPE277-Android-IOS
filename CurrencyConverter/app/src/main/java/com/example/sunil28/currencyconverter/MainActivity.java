package com.example.sunil28.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void getConvertedAmount(View view){

        EditText usdAmountEditText = (EditText) findViewById(R.id.editText2);
        double usdAmount = Double.parseDouble(usdAmountEditText.getText().toString());
        double conversionFactor = 64.15;
        double INRamount = conversionFactor*usdAmount;

        Toast.makeText(this, "INR: "+String.format("%.2f", INRamount), Toast.LENGTH_SHORT).show();

        Log.i("Info : ","Button clicked...!!!!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
