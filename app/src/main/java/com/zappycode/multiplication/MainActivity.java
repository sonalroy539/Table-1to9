package com.zappycode.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b_minus,b_plus;
    TextView tv_number,tv_result;

    int currentNumber = 1;
    int value1, value2, value3, value4, value5, value6, value7, value8, value9, value10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        b_minus =(Button)findViewById (R.id.b_minus);
        b_plus =(Button)findViewById (R.id.b_plus);
        tv_number =(TextView) findViewById (R.id.tv_number);
        tv_result =(TextView) findViewById (R.id.tv_result);

        calculateValues(currentNumber);


        b_minus.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                if (currentNumber > 1){
                    currentNumber --;
                    tv_number.setText (""+ currentNumber);

                    calculateValues (currentNumber);


                }


            }
        });

        b_plus.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                if (currentNumber < 9){
                    currentNumber ++;
                    tv_number.setText (""+ currentNumber);

                    calculateValues (currentNumber);

                }

            }
        });
    }

    private void calculateValues(int number){
        value1 = number;
        value2 = 2* number;
        value3 = 3* number;
        value4 = 4* number;
        value5 = 5* number;
        value6 = 6* number;
        value7 = 7* number;
        value8 = 8* number;
        value9 = 9* number;
        value10 = 10* number;

        tv_result.setText ("1 x" + currentNumber + "="+ value1+ "\n"+
                "2 x" + currentNumber + "="+ value2+ "\n"+
                "3 x" + currentNumber + "="+ value3+ "\n"+
                "4 x" + currentNumber + "="+ value4+ "\n"+
                "5 x" + currentNumber + "="+ value5+ "\n"+
                "6 x" + currentNumber + "="+ value6+ "\n"+
                "7 x" + currentNumber + "="+ value7+ "\n"+
                "8 x" + currentNumber + "="+ value8+ "\n"+
                "9 x" + currentNumber + "="+ value9+ "\n"+
                "10 x" + currentNumber + "="+ value10);

    }
}
