package com.example.baitap04;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtten, edtcmnd, edtbosung;
    RadioGroup rg;
    RadioButton tc, cd, dh;
    CheckBox db, ds, dc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtten = (EditText) findViewById(R.id.edt_ten);
        edtcmnd = (EditText) findViewById(R.id.edt_cmnd);
        edtbosung = (EditText) findViewById(R.id.edt_bosung);

        rg = (RadioGroup) findViewById(R.id.rg_1);

        db = (CheckBox) findViewById(R.id.cb_db);
        ds = (CheckBox) findViewById(R.id.cb_ds);
        dc = (CheckBox) findViewById(R.id.cb_dc);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Guithongtin();
            }
        });

    }
    public void Guithongtin() {

        // Kt tên > 3 ký tự
        String ten = edtten.getText() + "";
        ten = ten.trim();
        if(ten.length() <3){
            edtten.requestFocus();
            edtten.selectAll();
            Toast.makeText(this,"Tên phải >= 3 ký tự",Toast.LENGTH_LONG).show();
            return;
        }

        //Kt CMND có 9 chữ số
        String cmnd = edtcmnd.getText() + "";
        cmnd = cmnd.trim();
        if(cmnd.length() != 9){
            edtcmnd.requestFocus();
            edtcmnd.selectAll();
            Toast.makeText(this,"CMND phải đúng 9 chữ số",Toast.LENGTH_LONG).show();
            return;
        }

        // Kt Bằng cấp
        String bang = "";
        int checkid = rg.getCheckedRadioButtonId();
        if(checkid == -1){
            Toast.makeText(this,"Phải chọn bằng cấp",Toast.LENGTH_LONG).show();
            return;
        }
        RadioButton rd = (RadioButton)findViewById(checkid);
        bang = rd.getText() + "";

        // Sở thích
        String sothich = "";
        if(db.isChecked()){
            sothich += " " + db.getText() +"\n ";
        }
        if(ds.isChecked()){
            sothich += " " + ds.getText() +"\n";
        }
        if(dc.isChecked()){
            sothich += " " + dc.getText() +"\n";
        }

        String bosung = edtbosung.getText() + "\n";

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        // Hiển thị thông tin
        String tt = ten + "\n";
        tt += cmnd + "\n";
        tt += bang + "\n";
        tt += sothich + "\n";
        tt += "----------------------";
        tt += "Thông tin bổ sung";
        tt += bosung + "\n";
        tt += "----------------------";
        builder.setMessage(tt);
        builder.create().show();


    }


}