package com.example.shiru.codegenebootcamptaskone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CountryList extends AppCompatActivity {
    private String message;
    EditText edCountry;
    Button btnAdd;
    TextView txtdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        edCountry = findViewById(R.id.edtxtCountry);
        btnAdd = findViewById(R.id.btnAdd);
        txtdisplay = findViewById(R.id.txtDisplayCountry);

        //String message;
        message = edCountry.getText().toString();




        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(CountryList.this,"Button clicked",Toast.LENGTH_LONG).show();

                txtdisplay.setText(message);
                txtdisplay.append(message);

            }
        });


    }
}
