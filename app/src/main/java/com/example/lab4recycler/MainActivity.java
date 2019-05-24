package com.example.lab4recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "MainActivity";

    private EditText mCountry;
    private EditText mCity;
    private Button mButtonAdd;

    private RecyclerView mRecyclerView;
    private Adapter mAdapter;

    private List<Country> mCountries = new ArrayList<>();

    private String uuID = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);
        Log.d(TAG, "onCreate: started");



        mAdapter = new Adapter(getBaseContext(),mCountries);
        mCountry = findViewById(R.id.et_country);

        mCity = findViewById(R.id.et_city);

        mButtonAdd = findViewById(R.id.btn_add);
        mButtonAdd.setOnClickListener((v)->{

            uuID = UUID.randomUUID().toString();

            Country country = new Country(mCountry.getText().toString(),mCity.getText().toString());
            mCountries.add(country);

            Log.d("BtnAdd", "BtnClick: " + mCountry.getText() + mCity.getText());

            mAdapter.notifyDataSetChanged();
            Log.d(TAG, "uuID: " + uuID);

        });

        mRecyclerView = findViewById(R.id.rv_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(mAdapter);



    }



    private void isValid(){
        int count = Collections.frequency(mCountries,mCountry.getText().toString() + mCity.getText().toString());
        if (count == 2){
            Toast.makeText(this, "Данная пара уже существует", Toast.LENGTH_SHORT).show();
        }
    }
}
