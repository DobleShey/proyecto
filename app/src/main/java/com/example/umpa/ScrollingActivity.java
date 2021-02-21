package com.example.umpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
TextView button;
ImageView button2 ;
    TextView button3;
    ImageView button4 ;
    TextView button5;
    ImageView button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());
       button=(TextView) findViewById(R.id.textView2);
       button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, Elise.class);
                startActivity(i);
            }
        });
        button2 = (ImageView) findViewById(R.id.imageView);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, Elise.class);
                startActivity(i);
            }
        });
        button3=(TextView) findViewById(R.id.textView3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, iamachild.class);
                startActivity(i);
            }
        });
        button4 = (ImageView) findViewById(R.id.imageView2);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, iamachild.class);
                startActivity(i);
            }
        });
        button5=(TextView) findViewById(R.id.sides);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, Sidekick.class);
                startActivity(i);
            }
        });
        button6 = (ImageView) findViewById(R.id.sidekick);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(ScrollingActivity.this, Sidekick.class);
                startActivity(i);
            }
        });

    }
}