package com.br.zulamy25;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import com.br.zulamy25.Contador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private static boolean isMusicStarted = false;

//    @Override
//    protected void onStart() {
//        super.onStart();
//        if (!isMusicStarted) {
//            Intent musicIntent = new Intent(this, MusicService.class);
//            startService(musicIntent);
//            isMusicStarted = true;
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Contador.incrementActivityCount();
        setContentView(R.layout.activity_main);

        Intent serviceIntent = new Intent(this, MusicService.class);
        startService(serviceIntent);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(serviceIntent);
        } else {
            startService(serviceIntent);
        }

        GridLayout gridLayout = findViewById(R.id.gridLayout);
        Drawable buttonBackground = ContextCompat.getDrawable(this, R.drawable.background_button);
        if (buttonBackground == null) {
            Log.e("MainActivity", "Erro: background_button não encontrado!");
        }

        int totalColunas = 3; // Quantidade de botões por linha

        for (int i = 1; i <= 25; i++) {
            Button button = new Button(this);
            button.setText(String.valueOf(i));
            button.setBackground(buttonBackground);
            button.setTextColor(getResources().getColor(android.R.color.white));
            button.setTextSize(18);
            button.setAllCaps(false);

            // Parâmetros do botão para ocupar 1/3 da tela
            GridLayout.LayoutParams params = new GridLayout.LayoutParams();
            params.width = 0; // Permite ajuste automático
            params.height = GridLayout.LayoutParams.WRAP_CONTENT;
            params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f); // Cada botão ocupa 1/3 da linha
            params.setMargins(8, 8, 8, 8);
            button.setLayoutParams(params);

            int finalI = i;
            // Ação do botão para abrir a tela de detalhes
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("numero", finalI);
                    startActivity(intent);
                }
            });

            gridLayout.addView(button);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Contador.decrementActivityCount();
    }
}
