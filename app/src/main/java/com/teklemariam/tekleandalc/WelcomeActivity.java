package com.teklemariam.tekleandalc;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class WelcomeActivity extends AppCompatActivity {

    private TextView welcomeText;
    private Button abAlcButton;
    private Button myProfileButton;
    private AssetManager assetManager;
    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
//        typeface = ResourcesCompat.getFont(this, R.font.bauhaus);

        abAlcButton = findViewById(R.id.button_about_alc);
//        abAlcButton.setTypeface(typeface);

        myProfileButton = findViewById(R.id.button_my_profile);
        welcomeText = findViewById(R.id.welcometext);
//        welcomeText.setTypeface(typeface);

        assetManager = this.getApplicationContext().getAssets();



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
