package com.example.android.blazefire;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Base extends AppCompatActivity {
    //implements BottomNavigationView.OnNavigationItemSelectedListener

    com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
    }

//    private boolean loadFragment(Fragment fragment){
//        if (fragment != null){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.container,fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        Fragment fragment = null;
//        switch (item.getItemId()) {
//            case R.id.action_alarm:
//                fragment = new Alarm();
//                Log.i("NavBar", "Alarm Clicked");
//                break;
//            case R.id.action_community:
//                fragment = new Community();
//                Log.i("NavBar", "Community Clicked");
//                break;
//            case R.id.action_profile:
//                fragment = new Profile();
//                Log.i("NavBar", "Profile Clicked");
//                break;
//            case R.id.action_tutorial:
//                fragment = new Tutorial();
//                Log.i("NavBar", "Tutorial Clicked");
//                break;
//        }
//        return loadFragment(fragment);
//   }
}
