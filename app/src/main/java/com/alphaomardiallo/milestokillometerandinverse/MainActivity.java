package com.alphaomardiallo.milestokillometerandinverse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonConvMilesToKm;
    Button buttonConvKmToMiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConvMilesToKm = findViewById(R.id.buttonConvertMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxKm = (EditText) findViewById(R.id.editTextKm);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKM = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                textBoxKm.setText (formatVal.format(vKM));
            }
        });

        buttonConvKmToMiles = findViewById(R.id.buttonConvertKmToMiles);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textBoxKm = (EditText) findViewById(R.id.editTextMiles);
                EditText textBoxMiles = (EditText) findViewById(R.id.editTextKm);
                double vKM = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKM * 0.62137;//Double.valueOf(textBoxKm.getText().toString());
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                textBoxMiles.setText (formatVal.format(vMiles));
            }
        });
}

    @Override
    public void onClick(View view) {

    }
}