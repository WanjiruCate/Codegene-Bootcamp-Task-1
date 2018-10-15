package com.example.shiru.codegenebootcamptaskone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "mainactivity";
    private Button btn;
    private EditText etxtName;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnNext);
        etxtName = findViewById(R.id.edtxtName);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();

        editor.putString("key"," Shiru");
        editor.commit();

        String name = sharedPreferences.getString("some_other_key","default name");

        Log.e(TAG, "onCreate: name"+name);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome "+etxtName.getText().toString(),Toast.LENGTH_LONG).show();

                startActivity(new Intent(MainActivity.this,CountryList.class));
            }
        });



    }
}
