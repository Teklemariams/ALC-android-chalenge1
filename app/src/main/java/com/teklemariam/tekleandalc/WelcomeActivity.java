package com.teklemariam.tekleandalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button abAlcButton;
    private Button myProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        abAlcButton = findViewById(R.id.button_about_alc);
        myProfileButton= findViewById(R.id.button_my_profile);

        startALCScreen(abAlcButton);

        startProfileScreen(myProfileButton);
    }

    private void startProfileScreen(Button myProfileButton) {
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });
    }

    private void startALCScreen(Button abAlcButton) {
        abAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, AboutALCActivity.class);
                startActivity(intent);
            }
        });
    }
}
