package com.devjurnal.latihanfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devjurnal.latihanfragment.fragment.FragmentA;

public class TampungFragmentActivity extends AppCompatActivity {
    // TODO 4. Tambahkan 2 line Fragment & fragment transaction
    Fragment fragment = null;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampung_fragment);

    }

    private void setFragment() {
        if (fragment == null){
            fragment =new FragmentA();  // Default
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment , null);
            fragmentTransaction.commit();
        } else if (fragment != null){
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content, fragment , null);
            fragmentTransaction.commit();
        }
    }

    // TODO generate overide tombol ctrl+O



}
