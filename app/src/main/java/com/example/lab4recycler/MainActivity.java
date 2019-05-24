package com.example.lab4recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "MainActivity";

    private EditText mCountry;
    private EditText mCity;
    private Button mButtonAdd;

    private RecyclerView mRecyclerView;
    private Adapter mAdapter;

    private List<Country> mCountries = new ArrayList<>();



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

                mCountry.getText().toString();
                mCity.getText().toString();
            Log.d("BtnAdd", "BtnClick: " + mCountry.getText() + mCity.getText());
        });


        mRecyclerView = findViewById(R.id.rv_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();


    }
}
