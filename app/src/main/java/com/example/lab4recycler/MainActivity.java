package com.example.lab4recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mCountry;
    private EditText mCity;
    private Button mButtonAdd;

    private RecyclerView mRecyclerView;
    private Adapter mAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_main);

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

    }
}
