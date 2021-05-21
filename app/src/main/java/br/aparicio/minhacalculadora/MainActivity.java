package br.aparicio.minhacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_valor1, txt_valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        txt_valor1 = findViewById(R.id.valor1);
        txt_valor2 = findViewById(R.id.valor2);

        double valor1 = Double.parseDouble(txt_valor1.getText().toString());
        double valor2 = Double.parseDouble(txt_valor2.getText().toString());

        double resultado = valor1 + valor2;

        Intent intent = new Intent(this, Resposta.class);
        intent.putExtra("msg", valor1+" + "+valor2+" = "+resultado);
        startActivity(intent);

//        Abre um PopUp na tela com a resposta
//        Toast.makeText(this, ""+resultado, Toast.LENGTH_SHORT).show();
    }

    public void subtracao(View view){
        txt_valor1 = findViewById(R.id.valor1);
        txt_valor2 = findViewById(R.id.valor2);

        double valor1 = Double.parseDouble(txt_valor1.getText().toString());
        double valor2 = Double.parseDouble(txt_valor2.getText().toString());

        double resultado = valor1 - valor2;

        Intent intent = new Intent(this, Resposta.class);
        intent.putExtra("msg", valor1+" - "+valor2+" = "+resultado);
        startActivity(intent);
    }

    public void multiplicacao(View view){
        txt_valor1 = findViewById(R.id.valor1);
        txt_valor2 = findViewById(R.id.valor2);

        double valor1 = Double.parseDouble(txt_valor1.getText().toString());
        double valor2 = Double.parseDouble(txt_valor2.getText().toString());

        double resultado = valor1 * valor2;

        Intent intent = new Intent(this, Resposta.class);
        intent.putExtra("msg", valor1+" * "+valor2+" = "+resultado);
        startActivity(intent);
    }

    public void divisao(View view){
        txt_valor1 = findViewById(R.id.valor1);
        txt_valor2 = findViewById(R.id.valor2);

        double valor1 = Double.parseDouble(txt_valor1.getText().toString());
        double valor2 = Double.parseDouble(txt_valor2.getText().toString());

        double resultado = valor1 / valor2;

        Intent intent = new Intent(this, Resposta.class);
        intent.putExtra("msg", valor1+" / "+valor2+" = "+resultado);
        startActivity(intent);
    }
}