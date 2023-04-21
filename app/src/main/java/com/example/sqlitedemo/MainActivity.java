package com.example.sqlitedemo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.example.sqlitedemo.adapters.ViewPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

  private static void onConfigureTab(TabLayout.Tab tab, int position) {
    tab.setText("Tab " + (position + 1));
  }

  private static void onConfigureTab2(TabLayout.Tab tab, int position) {
    tab.setText("Tab " + (position + 1));
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Sự kiện ấn nút trôi
    FloatingActionButton floatingActionButton = findViewById(R.id.floatBtn);
    floatingActionButton.setOnClickListener(
        v -> {
          Intent intent = new Intent(MainActivity.this, AddActivity.class);
          startActivity(intent);
        });

    TabLayout tabLayout = findViewById(R.id.tabLayout);
    ViewPager2 viewPager = findViewById(R.id.viewPager);
    ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
    viewPager.setAdapter(viewPagerAdapter);
    new TabLayoutMediator(
            tabLayout,
            viewPager,
            (tab, position) -> {
              String tabTitle;
              switch (position) {
                case 0:
                  tabTitle = "Playlist";
                  break;
                case 1:
                  tabTitle = "BXH tuần";
                  break;
                default:
                  tabTitle = null;
                  break;
              }
              tab.setText(tabTitle);
            })
        .attach();
  }
}
