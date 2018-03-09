package com.example.tanmoy.dynamic_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    FrameLayout f1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        f1 = (FrameLayout)findViewById(R.id.f1);

        final DrawFragment obj = new DrawFragment();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DynamicFragment obj = new DynamicFragment();
                FragmentManager fm = getFragmentManager();   //Interface for interacting with Fragment objects inside of an Activity
                FragmentTransaction ft = fm.beginTransaction();   //API for performing a set of Fragment operations.
                ft.add(R.id.f1, obj);
                ft.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.f1, obj);
                ft.commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.remove(obj);
                ft.commit();
            }
        });
    }
}
