package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton BHermes = (ImageButton)findViewById(R.id.bttnHermes);
        BHermes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hermes.class);
                startActivity(intent);
                finish();
            }}
        );

        ImageButton BRL = (ImageButton)findViewById(R.id.bttnRL);
        BRL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RalphLauren.class);
                startActivity(intent);
                finish();
            }}
        );

        ImageButton BCapri = (ImageButton)findViewById(R.id.bttnCPRI);
        BCapri.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Capri.class);
                startActivity(intent);
                finish();
            }}
        );

        ImageButton BCD = (ImageButton)findViewById(R.id.bttnCD);
        BCD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChristianDior.class);
                startActivity(intent);
                finish();
            }}
        );

        Button info = (Button)findViewById(R.id.bttnInfo);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(MainActivity.this, info.class);
                startActivity(info);
                finish();
            }
        });


    }
}
