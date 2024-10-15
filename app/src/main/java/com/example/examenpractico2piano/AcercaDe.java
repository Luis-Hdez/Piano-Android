package com.example.examenpractico2piano;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acerca_de);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
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