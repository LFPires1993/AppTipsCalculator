package com.lfpires.tipscalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

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



    }
}
