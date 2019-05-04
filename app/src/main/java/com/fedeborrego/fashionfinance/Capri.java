package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Capri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capri);

        Button BackCapri = (Button) findViewById(R.id.backBttnCPRI);
        BackCapri.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                 Intent intent = new Intent(Capri.this, MainActivity.class);
                 startActivity(intent);
                 finish();
             }}
        );

        Button financialsCPRI = (Button) findViewById(R.id.bttnCpriFin);
        financialsCPRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent financials = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://finance.yahoo.com/quote/CPRI/financials?p=CPRI")
                );
                startActivity(financials);
            }
        });

        Button stockCPRI = (Button) findViewById(R.id.bttnCpriStock);
        stockCPRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stock = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://finance.yahoo.com/quote/CPRI/chart?p=CPRI&.tsrc=fin-srch")
                );
                startActivity(stock);
            }
        });

    }
}

