package com.br.zulamy25;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Contador.incrementActivityCount();
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        // Recebe o número do botão clicado
        Intent intent = getIntent();
        int numero = intent.getIntExtra("numero", 1);

        if (numero < 1 || numero > 25) {
            numero = 1; // Garante que o índice esteja dentro do intervalo válido
        }

        // Define a imagem e o texto de acordo com o número
        int[] imagens = {
                R.drawable.um, R.drawable.dois, R.drawable.tres, R.drawable.quadro, R.drawable.cinco,
                R.drawable.seis, R.drawable.sete, R.drawable.oito, R.drawable.nove, R.drawable.dez,
                R.drawable.onze, R.drawable.doze, R.drawable.treze, R.drawable.quartoze, R.drawable.quinze,
                R.drawable.dezeseis, R.drawable.dezesete, R.drawable.dezoito, R.drawable.dezenove, R.drawable.vinte,
                R.drawable.vinteeum, R.drawable.vinteedois, R.drawable.vinteetres, R.drawable.vinteequatro, R.drawable.vinteecinco
        };

        // Obtém os textos do arquivo strings.xml
        String[] textos = {
                getString(R.string.text1), getString(R.string.text2), getString(R.string.text3),
                getString(R.string.text4), getString(R.string.text5), getString(R.string.text6),
                getString(R.string.text7), getString(R.string.text8), getString(R.string.text9),
                getString(R.string.text10), getString(R.string.text11), getString(R.string.text12),
                getString(R.string.text13), getString(R.string.text14), getString(R.string.text15),
                getString(R.string.text16), getString(R.string.text17), getString(R.string.text18),
                getString(R.string.text19), getString(R.string.text20), getString(R.string.text21),
                getString(R.string.text22), getString(R.string.text23), getString(R.string.text24),
                getString(R.string.text25)
        };

        // Define o texto correspondente ao número do botão clicado
        textView.setText(textos[numero - 1]);

        // Define a imagem e o texto
        imageView.setImageResource(imagens[numero - 1]);
        textView.setText(textos[numero - 1]);
    }

    public void voltarTelaInicial(View view) {
        finish(); // Fecha a tela atual e volta para a MainActivity
        Contador.decrementActivityCount();
    }
}
