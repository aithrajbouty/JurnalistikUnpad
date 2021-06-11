package com.example.jurnalistikunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FasilitasActivity extends AppCompatActivity implements View.OnClickListener {

    public Button btnlabradio, btnlabtv, btnlabnews, btnlabperpus, btnlabcmc, btnlabhumas, btnlabfoto, btnlabgrafika;
    public CardView carddosen, cardkurikulum, cardlulusan, cardhmj, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_fasilitas);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("FASILITAS");

        btnlabradio = (Button) findViewById(R.id.button_lab_radio);
        btnlabtv = (Button) findViewById(R.id.button_lab_tv);
        btnlabnews = (Button) findViewById(R.id.button_lab_newsroom);
        btnlabperpus = (Button) findViewById(R.id.button_lab_perpus);
        btnlabcmc = (Button) findViewById(R.id.button_lab_cmc);
        btnlabhumas = (Button) findViewById(R.id.button_lab_humas);
        btnlabfoto = (Button) findViewById(R.id.button_lab_foto);
        btnlabgrafika = (Button) findViewById(R.id.button_lab_grafika);
        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) findViewById(R.id.card_kurikulum);
        cardlulusan = (CardView) findViewById(R.id.card_lulusan);
        cardhmj = (CardView) findViewById(R.id.card_hmj);
        cardback = (CardView) findViewById(R.id.card_back);

        btnlabradio.setOnClickListener(this);
        btnlabtv.setOnClickListener(this);
        btnlabnews.setOnClickListener(this);
        btnlabperpus.setOnClickListener(this);
        btnlabcmc.setOnClickListener(this);
        btnlabhumas.setOnClickListener(this);
        btnlabfoto.setOnClickListener(this);
        btnlabgrafika.setOnClickListener(this);
        carddosen.setOnClickListener(this);
        cardkurikulum.setOnClickListener(this);
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
            case R.id.button_lab_radio :
                i = new Intent(this, LabRadioActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_tv :
                i = new Intent(this, LabTvActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_newsroom :
                i = new Intent(this, LabNewsRoomActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_perpus :
                i = new Intent(this, LabPerpusActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_cmc :
                i = new Intent(this, LabCmcActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_humas :
                i = new Intent(this, LabHumasActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_foto :
                i = new Intent(this, LabFotografiActivity.class);
                startActivity(i);
                break;

            case R.id.button_lab_grafika :
                i = new Intent(this, LabGrafikaActivity.class);
                startActivity(i);
                break;

            case R.id.card_dosen :
                i = new Intent(this, DosenActivity.class);
                startActivity(i);
                break;

            case R.id.card_kurikulum :
                i = new Intent(this, KurikulumActivity.class);
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