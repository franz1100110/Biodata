package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void phone(View ph) {
        Intent p = new Intent(Intent.ACTION_DIAL);
        p.setData(Uri.parse("tel:0817349142"));
        startActivity(p);
    }

    public void home(View ho) {
        Uri hm = Uri.parse("geo:0,0?q=-7.026677, 110.495112");
        Intent in = new Intent(android.content.Intent.ACTION_VIEW,hm);
        startActivity(in);
    }

    public void email(View ma) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.putExtra(Intent.EXTRA_EMAIL, "111201811052@mhs.dinus.ac.id");
        intent.setType("text/plain");
        intent.setData(Uri.parse("mailto:"));
        startActivity(Intent.createChooser(intent, "Choose an email client :"));
    }
}