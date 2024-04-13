package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        int[] editTextIds = {R.id.editTextText3, R.id.editTextText4, R.id.editTextText5, R.id.editTextText6, R.id.editTextText7};

        for (int id : editTextIds) {
            EditText editText = findViewById(id);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus) {
                        ((EditText) v).setText("");
                    }
                }
            });
        }
    }
}
