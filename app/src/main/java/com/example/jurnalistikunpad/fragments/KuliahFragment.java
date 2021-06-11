package com.example.jurnalistikunpad.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jurnalistikunpad.DosenActivity;
import com.example.jurnalistikunpad.FasilitasActivity;
import com.example.jurnalistikunpad.HmjActivity;
import com.example.jurnalistikunpad.KurikulumActivity;
import com.example.jurnalistikunpad.LulusanActivity;
import com.example.jurnalistikunpad.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KuliahFragment extends Fragment {

    public CardView carddosen, cardkurikulum, cardfasilitas, cardlulusan, cardhmj;

    public KuliahFragment() {
        // Required empty public constructor
//        Bundle bundle = new Bundle();
//        bundle=getArguments();
//        if(bundle!=null){
//            String value=bundle.getString("key");
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kuliah, container, false);

        carddosen = (CardView) view.findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) view.findViewById(R.id.card_kurikulum);
        cardfasilitas = (CardView) view.findViewById(R.id.card_fasilitas);
        cardlulusan = (CardView) view.findViewById(R.id.card_lulusan);
        cardhmj = (CardView) view.findViewById(R.id.card_hmj);

        carddosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), DosenActivity.class);
                startActivity(in);
            }
        });
        cardkurikulum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), KurikulumActivity.class);
                startActivity(in);
            }
        });
        cardfasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), FasilitasActivity.class);
                startActivity(in);
            }
        });
        cardlulusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), LulusanActivity.class);
                startActivity(in);
            }
        });
        cardhmj.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), HmjActivity.class);
                startActivity(in);
            }
        });


        return view;
    }
}