package com.lfpires.tipscalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar  seekBarGorjeta;
    private EditText TextinputEntradaDeValorTotal;
    private TextView textViewPorcentagem, textViewFinalGorjeta, textViewFinalPreco;
    private double   porcentagem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarGorjeta               = findViewById(R.id.seekBarGorjeta);
        TextinputEntradaDeValorTotal = findViewById(R.id.TextinputEntradaDeValorTotal);
        textViewPorcentagem          = findViewById(R.id.textViewPorcentagem);
        textViewFinalGorjeta         = findViewById(R.id.textViewFinalGorjeta);
        textViewFinalPreco           = findViewById(R.id.textViewFinalPreco);

        seekBarGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // Interação com layout
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcentagem = progress;
                textViewPorcentagem.setText("R$ " + progress);
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void calcular(){
        String valor = TextinputEntradaDeValorTotal.getText().toString();

        if (valor == null || valor.equals("")){ // Validação
            Toast.makeText(
                    getApplicationContext(),
                    "Digite um valor!",
                    Toast.LENGTH_LONG);
        } else { // Calculo
            double valorDigitado = Double.parseDouble(valor);
            double valorGorjeta  = valorDigitado * this.porcentagem / 100;

            textViewFinalGorjeta.setText("R$ " + valorGorjeta);
            textViewFinalPreco.setText("R$ " + (valorDigitado + valorGorjeta));
        }
    }

}
