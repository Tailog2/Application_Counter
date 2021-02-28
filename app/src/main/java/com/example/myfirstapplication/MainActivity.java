package com.example.myfirstapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity implements MainActivity_Interface {
    TextView showCountTextView;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View fragmentActivity_main = inflater.inflate(R.layout.activity_main, container,false);
        // Get the count text view
        showCountTextView = fragmentActivity_main.findViewById(R.id.textCount);

        return fragmentActivity_main;
        }
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        view.findViewById(R.id.bigButton).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                countMe(view);
            }
        });
    }

    private void countMe(View view) {
        // Get the value of the text view
        String countString = showCountTextView.getText().toString();
        // Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;
        // Display the new value in the text view.
        showCountTextView.setText(count.toString());
    }

}
