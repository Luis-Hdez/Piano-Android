package com.example.examenpractico2piano;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PianoSelva extends AppCompatActivity {


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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_change_piano) {
            showPianoTypeDialog();
            return true;
        } else if (itemId == R.id.menu_about_us) {
            showAboutUs();
            return true;
        } else if (itemId == R.id.menu_exit) {
            finishAffinity();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void showPianoTypeDialog() {
        final String[] pianoTypes = {"Piano Tradicional", "Piano Infantil de la Selva", "Piano de Instrumentos musicales"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona el tipo de piano")
                .setItems(pianoTypes, (dialog, which) -> {
                    if (which == 0) {
                        showTraditionalPiano();
                    } else if (which == 1) {
                        showJunglePiano();
                    } else if (which == 2) {
                        showInstrumentsPiano();
                    }
                });
        builder.show();
    }

    private void showTraditionalPiano() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void showJunglePiano() {
        Intent intent = new Intent(this, PianoSelva.class);
        startActivity(intent);
    }

    private void showInstrumentsPiano() {
        Intent intent = new Intent(this, PianoInstrumentos.class);
        startActivity(intent);
    }

    private void showAboutUs() {
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
    }
}