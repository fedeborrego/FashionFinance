package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hermes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hermes);

        Button BackHermes = (Button)findViewById(R.id.backBttnHermes);
        BackHermes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(Hermes.this, MainActivity.class);
                startActivity(intent);
                finish(); }}
        );

        Button StockHermes = (Button)findViewById(R.id.bttnHermesStock);
            StockHermes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stock = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://finance.yahoo.com/quote/RMS.PA/chart?p=RMS.PA"));
                    startActivity(stock);
                }
            });

        Button FinancialsHermes = (Button)findViewById(R.id.bttnHermesFin);
            FinancialsHermes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent financials = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://finance.yahoo.com/quote/RMS.PA/financials?p=RMS.PA")
                    );
                    startActivity(financials);
                }
            });
    }
}
