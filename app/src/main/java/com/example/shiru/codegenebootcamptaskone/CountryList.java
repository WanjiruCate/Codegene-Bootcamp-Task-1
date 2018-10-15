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

    EditText edCountry,edName;
    Button btnAdd;
    TextView txtdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        edCountry = findViewById(R.id.edtxtCountry);
        edName = findViewById(R.id.edtxtName);
        btnAdd = findViewById(R.id.btnAdd);
        txtdisplay = findViewById(R.id.txtDisplayCountry);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(CountryList.this,"Button clicked",Toast.LENGTH_LONG).show();

                String message = edCountry.getText().toString();
                txtdisplay.setText("Country: "+message);


            }
        });


    }
}
