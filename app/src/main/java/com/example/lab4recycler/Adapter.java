package com.example.lab4recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Maxim Andrienko
 * 5/21/19
 */
public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {

    private CountryList mCountryList;


    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        return new AdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder adapterHolder, int i) {

        adapterHolder.setCountry(mCountryList.getCountry());
        adapterHolder.setCity(mCountryList.getCity());
    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {

        private TextView mCountry;
        private TextView mCity;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
            mCountry = itemView.findViewById(R.id.et_country);
            mCity = itemView.findViewById(R.id.et_city);
        }


        public void setCity(EditText city) {
            mCity = city;
        }

        public void setCountry(EditText country) {
            mCountry = country;
        }

    }
}
