package com.example.exercicecours1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnClick;
    private EditText numberOne;
    private EditText numberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.button) ;
        btnClick.setOnClickListener(this);

        numberOne = findViewById(R.id.editText);
        numberTwo = findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View view) {
        if(view == btnClick)
        {
            int int1 = Integer.parseInt(numberOne.getText().toString());
            int int2 = Integer.parseInt(numberTwo.getText().toString());

            if(int1 < int2)
            {
                Toast.makeText(this,
                        "Nombre 2 est plus grand", Toast.LENGTH_LONG).show();
            }
            else if (int1 > int2)
            {
                Toast.makeText(this,
                        "Nombre 1 est plus grand", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,
                        "Les nombres sont égaux", Toast.LENGTH_LONG).show();
            }
        }
    }
}
