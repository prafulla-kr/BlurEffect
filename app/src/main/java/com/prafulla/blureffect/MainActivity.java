package com.prafulla.blureffect;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnOpenDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenDialog = findViewById(R.id.btn_open_dialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlurDialogFragment blurDialogFragment = new BlurDialogFragment();
                blurDialogFragment.show(getSupportFragmentManager(),blurDialogFragment.getClass().getSimpleName());
            }
        });
    }
}