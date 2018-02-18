package com.example.android.farahurfani_1202152322_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pizzaABC (View view){
        Intent p = new Intent(menu.this, pizzaABC.class); // untuk bisa pindah ke activity pizzaABC dari activity menu
        startActivity(p);
    }
}
