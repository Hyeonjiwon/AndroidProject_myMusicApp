package com.example.task8;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    private TextView txt_name, txt_debut, txt_agency, txt_Award;
    private ImageView image;
    private ArtistDTO artistData;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artistdetail);

        //artistData = (ArtistDTO) getIntent().getSerializableExtra("item");
        //Log.d("artistInfo!!!", artistData.getName() + artistData.getAgency());

        image = findViewById(R.id.img_chart);
        txt_name = findViewById(R.id.txt_Name);
        txt_debut = findViewById(R.id.txt_Debut);
        txt_agency = findViewById(R.id.txt_Agency);
        txt_Award = findViewById(R.id.txt_Award);

        Bundle bundle = getIntent().getExtras();
        artistData = bundle.getParcelable("item");

        Log.d("artistData!!!", artistData.getName());
    }

}
