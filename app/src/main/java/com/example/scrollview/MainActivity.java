package com.example.scrollview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView by its ID and set the text
        TextView textView = findViewById(R.id.textView);
        textView.setText("The only limit to our realization of tomorrow is our doubts of today.!!");

        // Find the buttons by their IDs and set click listeners
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);

        // Set click listeners for the buttons
        button1.setOnClickListener(v -> showToast("Button 1 clicked!"));
        button2.setOnClickListener(v -> showToast("Button 2 clicked!"));
        button3.setOnClickListener(v -> showToast("Button 3 clicked!"));
        button4.setOnClickListener(v -> showToast("Button 4 clicked!"));
        button5.setOnClickListener(v -> showToast("Button 5 clicked!"));
        button6.setOnClickListener(v -> showToast("Button 6 clicked!"));
        button7.setOnClickListener(v -> showToast("Button 7 clicked!"));
        button8.setOnClickListener(v -> showToast("Button 8 clicked!"));
        button9.setOnClickListener(v -> showToast("Button 9 clicked!"));
        button10.setOnClickListener(v -> showToast("Button 10 clicked!"));
        button11.setOnClickListener(v -> showToast("Button 11 clicked!"));
        button12.setOnClickListener(v -> showToast("Button 12 clicked!"));
        button13.setOnClickListener(v -> showToast("Button 13 clicked!"));
        button14.setOnClickListener(v -> showToast("Button 14 clicked!"));
    }

    // Method to show a toast message
    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

