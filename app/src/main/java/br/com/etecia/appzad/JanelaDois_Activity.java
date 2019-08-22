package br.com.etecia.appzad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JanelaDois_Activity extends AppCompatActivity {
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);
        btnVoltar = (Button) findViewById(R.id.btnVoltarJanela1);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Você voltou para a janela 1",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
            }
        });

    }
}
