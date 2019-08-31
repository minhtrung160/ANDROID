package com.example.baitap01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText soa, sob;
    TextView kq;
    Button tong, hieu, tich, thuong, ucln, thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soa = (EditText)findViewById(R.id.edt_a);
        sob = (EditText)findViewById(R.id.edt_b);

        kq = (TextView)findViewById(R.id.txt_kq);

        tong = (Button)findViewById(R.id.btn_tong);
        hieu = (Button)findViewById(R.id.btn_hieu);
        tich = (Button)findViewById(R.id.btn_tich);
        thuong = (Button)findViewById(R.id.btn_thuong);
        ucln = (Button)findViewById(R.id.btn_ucln);
        thoat = (Button)findViewById(R.id.btn_thoát);


        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(soa.getText() + "") ;
                double b = Double.parseDouble(sob.getText() + "") ;

                Double c =(Double) a + b;
                String cong = "" + c;
                kq.setText(cong);

            }
        });

        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(soa.getText() + "") ;
                double b = Double.parseDouble(sob.getText() + "") ;

                Double t =(Double) a - b;
                String tinh = "" + t;
                kq.setText(tinh);

            }
        });

        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(soa.getText() + "") ;
                double b = Double.parseDouble(sob.getText() + "") ;

                Double t =(Double) a * b;
                String tinh = "" + t;
                kq.setText(tinh);

            }
        });
        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(soa.getText() + "") ;
                double b = Double.parseDouble(sob.getText() + "") ;

                Double t =(Double) a / b;
                String tinh = "" + t;
                kq.setText(tinh);

            }
        });

        ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(soa.getText() + "") ;
                double b = Double.parseDouble(sob.getText() + "") ;

                while (a != b) {
                    if (a > b) {
                        a -= b;
                    } else {
                        b -= a;
                    }
                }


                Double t =(Double) a;
                String tinh = "" + t;
                kq.setText(tinh);

            }
        });
        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

    }
}
