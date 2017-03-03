package com.example.mrworse.hitungluas;

import android.renderscript.Double2;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView textLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");
        getSupportActionBar().setLogo();

        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
        edtLebar = (EditText)findViewById(R.id.edt_lebar);
        btnHitung = (Button)findViewById(R.id.btn_hitung);
        textLuas = (TextView)findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(edtPanjang.getText()) || TextUtils.isEmpty(edtLebar.getText()) ) {
                    Toast.makeText(getApplicationContext(),"Nilai yang dimasukkan tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {

                    try {
                        double p = Double.valueOf(edtPanjang.getText().toString());
                        double l = Double.valueOf(edtLebar.getText().toString());
                        double luas = p * l;
                        textLuas.setText("Luas : " + luas);
                    } catch (NumberFormatException e) {
                        Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }


            }

        });

    }
}
