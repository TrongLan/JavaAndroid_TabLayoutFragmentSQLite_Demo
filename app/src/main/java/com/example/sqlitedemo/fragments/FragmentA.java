package com.example.sqlitedemo.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.sqlitedemo.R;
import org.jetbrains.annotations.NotNull;

public class FragmentA extends Fragment {
  @Nullable
  @org.jetbrains.annotations.Nullable
  @Override
  public View onCreateView(
      @NonNull @NotNull LayoutInflater inflater,
      @Nullable @org.jetbrains.annotations.Nullable ViewGroup container,
      @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.dynamic_fragment_a, container, false);
    return view;
  }

  @Override
  public void onViewCreated(
      @NonNull @NotNull View view,
      @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    EditText editText = view.findViewById(R.id.fragment_a_edittext);
    Button button = view.findViewById(R.id.fragment_a_btn);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        editText.setText(editText.getText().toString());
      }
    });
  }
}
