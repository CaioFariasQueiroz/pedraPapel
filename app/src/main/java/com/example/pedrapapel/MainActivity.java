package com.example.pedrapapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public  void selecionadoPedra(View view ){
        this.opcaoSelecionada("pedra");
        }
        public void selecionadaPapel(View view){
        this.opcaoSelecionada("papel");
        }
        public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
        }
    public void opcaoSelecionada (String opcaoSelecionada){
        ImageView imagemResltado = findViewById(R.id.imagemResultado);
        TextView textoResultado = findViewById(R.id.quemGanho);
        int numero = new Random().nextInt(3);
        String [] opcoes ={"pedra","papel","tesoura"};
        String opcaoApp = opcoes[numero];
        System.out.println("item"+opcaoApp);

        switch (opcaoApp){
            case "pedra":
                imagemResltado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResltado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResltado.setImageResource(R.drawable.tesoura);
                break;
        }
        if (
                (opcaoApp == "papel" && opcaoSelecionada == "pedra")|| (opcaoApp == "tesoura" && opcaoSelecionada == "papel")|| (opcaoApp == "pedra" && opcaoSelecionada =="tesoura")
        ){textoResultado.setText("NÃO FOI DESSA VEZ  ༼\u2060 \u2060ಥ\u2060 \u2060‿\u2060 \u2060ಥ\u2060 \u2060༽ ");}
        else if (
                (opcaoSelecionada == "papel" && opcaoApp == "pedra")|| (opcaoSelecionada == "tesoura" && opcaoApp == "papel")|| (opcaoSelecionada == "pedra" && opcaoApp =="tesoura")
        ) {
            textoResultado.setText("VOCÊ GANHOU ヾ\u2060(\u2060 ͝\u2060°\u2060 ͜\u2060ʖ͡\u2060°\u2060)\u2060ノ\u2060");
        }
        else {textoResultado.setText("EMPATAMOS \uD83E\uDEE0\n");}
    }
}