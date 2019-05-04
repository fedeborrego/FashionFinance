package com.fedeborrego.fashionfinance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        Button email = (Button)findViewById(R.id.bttnEmial);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "federico_borrego@icloud.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Luxury Fashion Finance");
                intent.putExtra(Intent.EXTRA_TEXT, "(Enter email's body here");

                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });


        Button call = (Button)findViewById(R.id.bttnPhone);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:9806432075"));
                startActivity(call);
            }
        });

        Button home = (Button)findViewById(R.id.backBttnInfo);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(info.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}
