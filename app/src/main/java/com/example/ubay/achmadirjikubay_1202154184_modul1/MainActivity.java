package com.example.ubay.achmadirjikubay_1202154184_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public int modal = 65500;
    private int makan = 50000;
    private int notnormalmakan =30000;
    private int totalharga;
    private EditText mMenu;
    private EditText mJumlah;
    private Button mPilihan1;
    private Button mPilihan2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = (EditText) findViewById(R.id.menu);
        mJumlah = (EditText) findViewById(R.id.jumlah);
        mPilihan1 = (Button) findViewById(R.id.makan);
        mPilihan2 = (Button) findViewById(R.id.notnormal);
    }


    public void notnormal(View view) {
        Log.d(LOG_TAG,"Clicked");

        int jumlah = Integer.parseInt(mJumlah.getText().toString());
        String menu = mMenu.getText().toString();

        totalharga = jumlah *notnormalmakan;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("jumlah",jumlah);
        intent.putExtra("menu",menu);
        intent.putExtra("totalharga", totalharga);
        intent.putExtra("modal", modal);
        intent.putExtra("tempat","KFC");
        startActivity(intent);
    }

    public void pilihmakan(View view) {
        Log.d(LOG_TAG,"Berhasil");

        int jumlah = Integer.parseInt(mJumlah.getText().toString());
        String menu = mMenu.getText().toString();

        totalharga = jumlah *makan;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("menu",menu);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("totalharga",totalharga);
        intent.putExtra("modal", modal);
        intent.putExtra("tempat", "Munjul");

        startActivity(intent);
    }
}
