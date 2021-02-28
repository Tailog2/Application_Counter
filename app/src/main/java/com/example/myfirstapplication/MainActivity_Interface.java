package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public interface MainActivity_Interface {
    View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    );

    void onViewCreated(@NonNull View view, Bundle savedInstanceState);
}
