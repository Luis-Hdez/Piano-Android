package com.example.examenpractico2piano;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PianoInstrumentos extends AppCompatActivity {

    Button gs, ac, bj, dm, tr;

    private MediaPlayer md1, md2, md3, md4, md5;

    private boolean isKeyPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_instrumentos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        gs=(Button) findViewById(R.id.guitarE);
        ac=(Button) findViewById(R.id.guitarS);
        bj=(Button) findViewById(R.id.bajo);
        dm=(Button) findViewById(R.id.drums);
        tr=(Button) findViewById(R.id.trompeta);

        md1 = MediaPlayer.create(this, R.raw.guitarra);
        md2 = MediaPlayer.create(this, R.raw.acustica);
        md3 = MediaPlayer.create(this, R.raw.slapbass);
        md4 = MediaPlayer.create(this, R.raw.bateria);
        md5 = MediaPlayer.create(this, R.raw.trompeta);

        gs.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!isKeyPressed) {  // Solo se ejecuta si no hay otra tecla presionada
                    isKeyPressed = true;  // Marcamos que una tecla está presionada

                    if (md1.isPlaying()) {
                        md1.pause();    // Pausa si está reproduciendo
                        md1.seekTo(0);  // Regresa al inicio del audio
                    }
                    md1.start();        // Reproduce el audio desde el principio

                    // Cambia el color mientras está presionada
                    gs.setBackgroundColor(getColor(R.color.touched));

                    // Cuenta regresiva para devolver el color original y liberar el flag
                    new CountDownTimer(100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            // Nada que hacer en cada tick
                        }

                        @Override
                        public void onFinish() {
                            gs.setBackgroundColor(getColor(R.color.return_key));  // Restauramos el color original
                            isKeyPressed = false;  // Liberamos el flag
                        }
                    }.start();
                }
                return false;  // Permite que el evento siga su curso
            }
        });
        ac.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!isKeyPressed) {  // Solo se ejecuta si no hay otra tecla presionada
                    isKeyPressed = true;  // Marcamos que una tecla está presionada

                    if (md2.isPlaying()) {
                        md2.pause();    // Pausa si está reproduciendo
                        md2.seekTo(0);  // Regresa al inicio del audio
                    }
                    md2.start();        // Reproduce el audio desde el principio

                    // Cambia el color mientras está presionada
                    ac.setBackgroundColor(getColor(R.color.touched));

                    // Cuenta regresiva para devolver el color original y liberar el flag
                    new CountDownTimer(100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            // Nada que hacer en cada tick
                        }

                        @Override
                        public void onFinish() {
                            ac.setBackgroundColor(getColor(R.color.return_key));  // Restauramos el color original
                            isKeyPressed = false;  // Liberamos el flag
                        }
                    }.start();
                }
                return false;  // Permite que el evento siga su curso
            }
        });
        bj.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!isKeyPressed) {  // Solo se ejecuta si no hay otra tecla presionada
                    isKeyPressed = true;  // Marcamos que una tecla está presionada

                    if (md3.isPlaying()) {
                        md3.pause();    // Pausa si está reproduciendo
                        md3.seekTo(0);  // Regresa al inicio del audio
                    }
                    md3.start();        // Reproduce el audio desde el principio

                    // Cambia el color mientras está presionada
                    bj.setBackgroundColor(getColor(R.color.touched));

                    // Cuenta regresiva para devolver el color original y liberar el flag
                    new CountDownTimer(100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            // Nada que hacer en cada tick
                        }

                        @Override
                        public void onFinish() {
                            bj.setBackgroundColor(getColor(R.color.return_key));  // Restauramos el color original
                            isKeyPressed = false;  // Liberamos el flag
                        }
                    }.start();
                }
                return false;  // Permite que el evento siga su curso
            }
        });
        dm.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!isKeyPressed) {  // Solo se ejecuta si no hay otra tecla presionada
                    isKeyPressed = true;  // Marcamos que una tecla está presionada

                    if (md4.isPlaying()) {
                        md4.pause();    // Pausa si está reproduciendo
                        md4.seekTo(0);  // Regresa al inicio del audio
                    }
                    md4.start();        // Reproduce el audio desde el principio

                    // Cambia el color mientras está presionada
                    dm.setBackgroundColor(getColor(R.color.touched));

                    // Cuenta regresiva para devolver el color original y liberar el flag
                    new CountDownTimer(100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            // Nada que hacer en cada tick
                        }

                        @Override
                        public void onFinish() {
                            dm.setBackgroundColor(getColor(R.color.return_key));  // Restauramos el color original
                            isKeyPressed = false;  // Liberamos el flag
                        }
                    }.start();
                }
                return false;  // Permite que el evento siga su curso
            }
        });
        tr.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!isKeyPressed) {  // Solo se ejecuta si no hay otra tecla presionada
                    isKeyPressed = true;  // Marcamos que una tecla está presionada

                    if (md5.isPlaying()) {
                        md5.pause();    // Pausa si está reproduciendo
                        md5.seekTo(0);  // Regresa al inicio del audio
                    }
                    md5.start();        // Reproduce el audio desde el principio

                    // Cambia el color mientras está presionada
                    tr.setBackgroundColor(getColor(R.color.touched));

                    // Cuenta regresiva para devolver el color original y liberar el flag
                    new CountDownTimer(100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            // Nada que hacer en cada tick
                        }

                        @Override
                        public void onFinish() {
                            tr.setBackgroundColor(getColor(R.color.return_key));  // Restauramos el color original
                            isKeyPressed = false;  // Liberamos el flag
                        }
                    }.start();
                }
                return false;  // Permite que el evento siga su curso
            }
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