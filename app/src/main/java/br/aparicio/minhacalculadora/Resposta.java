package br.aparicio.minhacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        TextView resposta = findViewById(R.id.textview_resultado);
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("msg");
        resposta.setText(mensagem);
    }
    public void voltar (View view){
        finish();
    }

}