package com.example.sqlitedemo.adapters;

import static androidx.constraintlayout.widget.ConstraintLayoutStates.TAG;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.sqlitedemo.fragments.ChartFragment;
import com.example.sqlitedemo.fragments.PlaylistFragment;
import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {
  private static final int NUM_PAGES = 2;

  public ViewPagerAdapter(@NonNull @NotNull FragmentActivity fragmentActivity) {
    super(fragmentActivity);
  }

  @NonNull
  @NotNull
  @Override
  public Fragment createFragment(int position) {
    switch (position) {
      case 0:
        return new PlaylistFragment();
      case 1:
        return new ChartFragment();
      default:
        Log.e(TAG, "No fragment found");
        break;
    }
    return null;
  }

  @Override
  public int getItemCount() {
    return NUM_PAGES;
  }
}
