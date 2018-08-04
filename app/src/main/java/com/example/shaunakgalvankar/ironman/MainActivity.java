package com.example.shaunakgalvankar.ironman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int Rate=6;
    public int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView quant=(TextView) findViewById(R.id.edittx1);
    quant.setText(quantity)

    public void increment(View view) {
        quantity=quantity+1;

    }

    public void decrement(View view) {
        quantity=quantity-1;

    }


}
