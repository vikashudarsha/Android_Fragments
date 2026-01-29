package com.vu.android_fragments.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vu.android_fragments.R;
import com.vu.android_fragments.fragment.settingFragment;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
          if (savedInstanceState == null){
              getSupportFragmentManager().beginTransaction()
                      .setReorderingAllowed(true)
                      .add(R.id.fragment_container_view, settingFragment.class, null)
                      .commit();
          }
    }
}