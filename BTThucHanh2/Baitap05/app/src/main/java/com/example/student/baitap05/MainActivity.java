package com.example.student.baitap05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ten,sl,kh,khvip,dt;
    CheckBox check;
    TextView tt;
    Button ttt,next,tk;

    int tong = 0,slvip = 0,tdt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ten = (EditText)findViewById(R.id.edt_ten);
        sl = (EditText)findViewById(R.id.edt_sl);
        kh = (EditText)findViewById(R.id.edt_tongkh);
        khvip = (EditText)findViewById(R.id.edt_tongkhvip);
        dt = (EditText)findViewById(R.id.edt_dt);
        check = (CheckBox)findViewById(R.id.cb_vip);
        tt = (TextView)findViewById(R.id.txt_tt);
        ttt= (Button)findViewById(R.id.btn_tt);
        next = (Button)findViewById(R.id.btn_next);
        tk = (Button)findViewById(R.id.btn_tk);

        ttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //int vip=0;
                if(ten.length() > 0){
                    double sls = Double.parseDouble(sl.getText()+"");
                    double tinh;
                    if(check.isChecked()){
                        tinh = (sls * 20000)*0.9;
                        tt.setText( tinh + "");
                        slvip ++;
                    }else {
                        tinh = sls * 20000;
                        tt.setText( tinh + "");
                        slvip = slvip + 0;
                    }
                    tong ++;
                    tdt += tinh;
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ten.setText(" "+"");
                sl.setText(" "+"");
                tt.setText(" "+"");
                check.setChecked(false);
                ten.requestFocus();
            }
        });

        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kh.setText(tong +"");
                khvip.setText(slvip+"");
                dt.setText(tdt+"");

            }
        });
    }
}
