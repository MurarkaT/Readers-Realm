package com.example.readersrealm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    private static final String CHANNEL_ID="My Channel";
    private static final int NOTIFICATION_ID=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        loadFragment(new AFragment());
}

    private void loadFragment(AFragment aFragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.container,aFragment);
        ft.commit();
    }
    }