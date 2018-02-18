package com.example.android.farahurfani_1202152322_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeAway extends AppCompatActivity {

    private Button button2; // inisiasi button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_away);

        button2 = (Button) findViewById(R.id.button2); //untuk mendapatkan id button2

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(TakeAway.this, menu.class); // untuk pindah dari activity TakeAway ke activity menu
                startActivity(a);
            }
        });
    }
}
