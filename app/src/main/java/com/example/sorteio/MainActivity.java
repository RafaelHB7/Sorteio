package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        resultado = findViewById(R.id.textView3);
    }

    public void realizarSorteio(View view){
        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());

        int nAlreatorio = (int) (Math.random() * n2) + n1;
        resultado.setText(nAlreatorio);
    }
}
