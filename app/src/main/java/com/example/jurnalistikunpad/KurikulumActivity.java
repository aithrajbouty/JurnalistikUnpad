package com.example.jurnalistikunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KurikulumActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView carddosen, cardfasilitas, cardlulusan, cardhmj, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurikulum);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_kurikulum);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("KURIKULUM");

        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardfasilitas = (CardView) findViewById(R.id.card_fasilitas);
        cardlulusan = (CardView) findViewById(R.id.card_lulusan);
        cardhmj = (CardView) findViewById(R.id.card_hmj);
        cardback = (CardView) findViewById(R.id.card_back);

        carddosen.setOnClickListener(this);
        cardfasilitas.setOnClickListener(this);
        cardlulusan.setOnClickListener(this);
        cardhmj.setOnClickListener(this);
        cardback.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card_dosen :
                i = new Intent(this, DosenActivity.class);
                startActivity(i);
                break;

            case R.id.card_fasilitas :
                i = new Intent(this, FasilitasActivity.class);
                startActivity(i);
                break;

            case R.id.card_lulusan :
                i = new Intent(this, LulusanActivity.class);
                startActivity(i);
                break;

            case R.id.card_hmj :
                i = new Intent(this, HmjActivity.class);
                startActivity(i);
                break;

            case R.id.card_back :
                i = new Intent(this, MainActivity.class);
                i.putExtra("key", "value");
                startActivity(i);
                break;
        }
    }
}