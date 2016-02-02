package com.example.prasadtumma.libraryprojecttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.prasadtumma.lpt.ImageLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        View view = new ImageLayout(this);
        setContentView(view);
    }
}
