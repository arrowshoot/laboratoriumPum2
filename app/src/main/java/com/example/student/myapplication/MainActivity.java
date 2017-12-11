package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chnageBtn = findViewById(R.id.zmien);
        final EditText chnageEdt = findViewById(R.id.wpisz);
        final TextView text = findViewById(R.id.miasto);
        Button chnageBtnn = findViewById(R.id.pokaz);


        chnageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(chnageEdt.getText().toString());
            }
        });

        chnageBtnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(MainActivity.this,ListaActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("miasto",chnageEdt.getText().toString());
                toy.putExtra("klucz", bundle);
                startActivity(toy);
            }
        });
    }
}
