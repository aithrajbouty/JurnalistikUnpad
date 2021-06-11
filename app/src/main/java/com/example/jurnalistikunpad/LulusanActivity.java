package com.example.jurnalistikunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LulusanActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView carddosen, cardkurikulum, cardfasilitas, cardhmj, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lulusan);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_lulusan);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("KOMPETENSI LULUSAN");

        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) findViewById(R.id.card_kurikulum);
        cardfasilitas = (CardView) findViewById(R.id.card_fasilitas);
        cardhmj = (CardView) findViewById(R.id.card_hmj);
        cardback = (CardView) findViewById(R.id.card_back);

        carddosen.setOnClickListener(this);
        cardkurikulum.setOnClickListener(this);
        cardfasilitas.setOnClickListener(this);
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

            case R.id.card_kurikulum :
                i = new Intent(this, KurikulumActivity.class);
                startActivity(i);
                break;

            case R.id.card_fasilitas :
                i = new Intent(this, FasilitasActivity.class);
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