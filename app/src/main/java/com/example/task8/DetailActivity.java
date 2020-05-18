package com.example.task8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //데이터 수신
        Intent intent = getIntent();
        String albumID = intent.getExtras().getString("albumID");

        Log.d("Detail!!!", albumID);
    }
}
