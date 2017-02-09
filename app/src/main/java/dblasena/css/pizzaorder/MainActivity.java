package dblasena.css.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton rbLarge;
    RadioButton rbMedium;
    RadioButton rbSmall;
    CheckBox chbox_Cheese;
    CheckBox chBox_Delivery;
    TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbLarge = (RadioButton) findViewById(R.id.Large);
        rbMedium = (RadioButton) findViewById(R.id.Medium);
        rbSmall = (RadioButton) findViewById(R.id.Small);
        chbox_Cheese = (CheckBox) findViewById(R.id.Cheese);
        chBox_Delivery = (CheckBox) findViewById(R.id.Delivery);
        txtTotal = (TextView) findViewById(R.id.Total);
    }


    public void Calculate(View view) {
        double total = 0;

        if (rbLarge.isChecked())  {
            total = total + 13;
        }
        if (rbMedium.isChecked())  {
            total = total + 9;
        }

        if (rbSmall.isChecked())  {
            total = total + 7;
        }

        if (chbox_Cheese.isChecked()) {
            total = total + 1.75;
        }

        if (chBox_Delivery.isChecked()) {
            total = total + 2.50;
        }
        String strtot = String.valueOf(total);
        txtTotal.setText(String.format("Your total is $%.2f", total));
    }



}
