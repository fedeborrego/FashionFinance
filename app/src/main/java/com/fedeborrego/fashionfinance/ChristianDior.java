package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChristianDior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christian_dior);

        Button BackCD = (Button)findViewById(R.id.backBttnCD);
        BackCD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ChristianDior.this, MainActivity.class);
                startActivity(intent);
                finish();
            }}
        );

        Button StockCD = (Button)findViewById(R.id.bttnCDStock);
        StockCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent stock = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://finance.yahoo.com/quote/CDI.PA/chart?p=CDI.PA")
                    );
                    startActivity(stock);
            }
        });

        Button FinancialsCD = (Button)findViewById(R.id.bttnCDFin);
        FinancialsCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent financials = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://finance.yahoo.com/quote/CDI.PA/financials?p=CDI.PA")
                    );
                    startActivity(financials);
            }
        });

    }
}
