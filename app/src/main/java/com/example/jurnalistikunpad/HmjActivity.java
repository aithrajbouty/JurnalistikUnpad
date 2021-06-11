package com.example.jurnalistikunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HmjActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView carddosen, cardkurikulum, cardfasilitas, cardlulusan, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmj);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_hmj);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("HIMPUNAN MAHASISWA");

        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) findViewById(R.id.card_kurikulum);
        cardfasilitas = (CardView) findViewById(R.id.card_fasilitas);
        cardlulusan = (CardView) findViewById(R.id.card_lulusan);
        cardback = (CardView) findViewById(R.id.card_back);

        carddosen.setOnClickListener(this);
        cardkurikulum.setOnClickListener(this);
        cardfasilitas.setOnClickListener(this);
        cardlulusan.setOnClickListener(this);
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

            case R.id.card_lulusan :
                i = new Intent(this, LulusanActivity.class);
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