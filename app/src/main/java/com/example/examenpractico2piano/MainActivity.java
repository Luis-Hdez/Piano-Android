package com.example.examenpractico2piano;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnDO = findViewById(R.id.btnDO);
        ImageButton btnDOSostenido = findViewById(R.id.btnDOSostenido);
        ImageButton btnRE = findViewById(R.id.btnRE);
        ImageButton btnRESostenido = findViewById(R.id.btnRESostenido);
        ImageButton btnMI = findViewById(R.id.btnMI);
        ImageButton btnFA = findViewById(R.id.btnFA);
        ImageButton btnFASostenido = findViewById(R.id.btnFASostenido);
        ImageButton btnSOL = findViewById(R.id.btnSOL);
        ImageButton btnSOLSostenido = findViewById(R.id.btnSOLSostenido);
        ImageButton btnLA = findViewById(R.id.btnLA);
        ImageButton btnLASostenido = findViewById(R.id.btnLASostenido);
        ImageButton btnSI = findViewById(R.id.btnSI);

    }

    private void MessageBox(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    public void DO(View view) {
        
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.dooo);
        sonido.start();
        MessageBox("DO");
    }

    public void DOSostenido(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.dostretched);
        sonido.start();
    }

    public void RE(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.re);
        sonido.start();
    }

    public void RESostenido(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.restretched);
        sonido.start();
    }

    public void MI(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mi);
        sonido.start();
    }

    public void FA(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fa);
        sonido.start();
    }

    public void FASostenido(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fastretched);
        sonido.start();
    }

    public void SOL(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sol);
        sonido.start();
    }

    public void SOLSostenido(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.solstretched);
        sonido.start();
    }

    public void LA(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.la);
        sonido.start();
    }

    public void LASostenido(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.lastretched);
        sonido.start();
    }

    public void SI(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.si);
        sonido.start();
    }
}