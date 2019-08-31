package com.example.baitap02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText f, c;
    Button to_cel, to_fah, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f = (EditText)findViewById(R.id.edt_fah);
        c = (EditText)findViewById(R.id.edt_cel);
        to_cel = (Button)findViewById(R.id.btn_to_cel);
        to_fah = (Button)findViewById(R.id.btn_to_fah);
        clear = (Button)findViewById(R.id.btn_to_clear);

        to_cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fa = Double.parseDouble(f.getText()+ "");
                double ce = (fa - 32) / 1.8;
                String cel = "" + ce;
                c.setText(cel);
            }
        });

        to_fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double ce = Double.parseDouble(c.getText()+ "");
                double fa = 1.8*ce + 32;
                String fah =  "" + fa;
                f.setText(fah);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setText(" ");
                c.setText(" ");
            }
        });
    }
}
