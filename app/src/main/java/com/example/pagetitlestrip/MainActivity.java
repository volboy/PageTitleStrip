package com.example.pagetitlestrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager=findViewById(R.id.pager);
        pager.setAdapter(new FragmentAdapter(this, getSupportFragmentManager()));
    }
}
