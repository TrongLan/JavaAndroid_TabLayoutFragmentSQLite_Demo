package com.example.sqlitedemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.sqlitedemo.R;
import org.jetbrains.annotations.NotNull;

public class FragmentStatic extends Fragment {
  @Nullable
  @org.jetbrains.annotations.Nullable
  @Override
  public View onCreateView(
      @NonNull @NotNull LayoutInflater inflater,
      @Nullable @org.jetbrains.annotations.Nullable ViewGroup container,
      @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_static, container, false);
    return view;
  }
}
