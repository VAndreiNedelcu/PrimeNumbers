package com.example.andrei.primenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button primeButton = (Button) findViewById(R.id.primeButton);
        primeButton.setOnClickListener(
                new Button.OnClickListener(){
        public void onClick(View v){
            TextView primeText = (TextView) findViewById(R.id.primeText);
            int max =  500;
            for(int i=2; i<=max; i++) {
                boolean isPrimeNumber = true;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0 ) {
                        isPrimeNumber = false;
                        break;
                    }

                }
                if (isPrimeNumber){
                    primeText.setText(Integer.toString(i));
                }
            }
        }
    }
        );
}
}