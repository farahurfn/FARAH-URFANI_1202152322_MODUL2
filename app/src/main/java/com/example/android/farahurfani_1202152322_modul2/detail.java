package com.example.android.farahurfani_1202152322_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class detail extends AppCompatActivity{

    private Button button3; //inisiasi button3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button3 = (Button) findViewById(R.id.button3); // untuk mencari id dari button3

        button3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent b = new Intent(detail.this, menu.class); //untuk pindah dari activity detail ke activity menu
                startActivity(b); //start
            }
        });

    }
}
