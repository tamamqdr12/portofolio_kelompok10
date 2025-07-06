package com.kelompok_10.karina;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.kelompok_10.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class KarinaActivity extends AppCompatActivity {

    private final Fragment cvFragment = new CvFragment();
    private final Fragment aktivitasFragment = new AktivitasFragment();
    private final Fragment aboutFragment = new AboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karina);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, cvFragment).commit();

        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            int itemId = item.getItemId();
            if (itemId == R.id.nav_cv) {
                selectedFragment = cvFragment;
            } else if (itemId == R.id.nav_aktivitas) {
                selectedFragment = aktivitasFragment;
            } else if (itemId == R.id.nav_about) {
                selectedFragment = aboutFragment;
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            }
            return false;
        });
    }
}
