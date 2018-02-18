package com.example.android.farahurfani_1202152322_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) { //untuk radio button yang dipilih
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.buttonDineIn:
                if (checked)
                    displayToast("Dine In"); // jika button dinein yang dipilih makan akan keluar toast "Dine In"
                break;
            case R.id.buttonTakeAway:
                if (checked)
                    displayToast("Take Away"); // jika button takeaway yang dipilih maka akan keluar toast "Take Away"
                break;
        }
    }

    private void displayToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show(); // untuk mendisplay toast
    }

    public void pesansekarang(View view) { //dari button onclick pesan sekarang
        if (((RadioButton)findViewById(R.id.buttonDineIn)).isChecked()) {
           Intent a = new Intent(this, detail.class);
            startActivity(a); // jika radio button dipilih dine in, maka saat klik button pesan sekarang akan mengarah ke detail
        }else if (((RadioButton)findViewById(R.id.buttonTakeAway)).isChecked()){
            Intent a = new Intent(this,TakeAway.class);
            startActivity(a); // jika radio button dipilih dine in, maka saat klik button pesan sekarang akan mengarah ke take away
        }else{
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show(); //jika belum ada yang dipilih maka pilih terlebih dahulu
        }

        }
}
