package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RalphLauren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ralph_lauren);

        Button BackRL = (Button)findViewById(R.id.backBttnRL);
        BackRL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(RalphLauren.this, MainActivity.class);
                startActivity(intent);
                finish();
            }}
        );

        Button StockRL = (Button) findViewById(R.id.bttnRLStock);
        StockRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stock = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://finance.yahoo.com/quote/RL/chart?p=RL")
                );
                startActivity(stock);
            }
        });

        Button FinancialsRL = (Button) findViewById(R.id.bttnRLFin);
        FinancialsRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent financials = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://finance.yahoo.com/quote/RL/financials?p=RL&.tsrc=fin-srch")
                );
                startActivity(financials);
            }
        });

    }
}
