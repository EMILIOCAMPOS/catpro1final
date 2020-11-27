package com.emilio.fragmenttabhost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;

public class MiFragmentTabhost extends FragmentActivity {
    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_fragment_tabhost);
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,

                getSupportFragmentManager(),android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("MI NOMBRE"),

                Tab1.class, null);

tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("CALCULADORA"),

Tab2.class, null);

tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("OTRA FUNCION"),

Tab3.class, null);

    }
}