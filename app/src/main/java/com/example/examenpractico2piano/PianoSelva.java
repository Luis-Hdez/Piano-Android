package com.example.examenpractico2piano;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PianoSelva extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_selva);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnlion = findViewById(R.id.btnlion);
        ImageButton btnmonkey = findViewById(R.id.btnmonkey);
        ImageButton btnfrog = findViewById(R.id.btnfrog);
        ImageButton btnelephant = findViewById(R.id.btnelephant);
        ImageButton btnzebra = findViewById(R.id.btnzebra);
    }

    public void Lion(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.lion);
        sonido.start();
    }

    public void Monkey(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.monkey);
        sonido.start();
    }

    public void Frog(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.frog);
        sonido.start();
    }

    public void Elephant(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.elephant);
        sonido.start();
    }

    public void Zebra(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.zebra);
        sonido.start();
    }
}