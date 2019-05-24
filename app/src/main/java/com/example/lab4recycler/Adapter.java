package com.example.lab4recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Maxim Andrienko
 * 5/21/19
 */
public class Adapter extends RecyclerView.Adapter<Adapter.AdapterHolder> {

    private List<Country> mCountryList;
    private Context mContext;

    public static final String TAG = Adapter.class.getSimpleName();

    public Adapter(Context context, List<Country> countryList){
        mContext = context;
        mCountryList = countryList;
    }


    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        return new AdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder adapterHolder, int i) {

        adapterHolder.setCountry(mCountryList.get(i).getCountry());
        adapterHolder.setCity(mCountryList.get(i).getCity());
        Log.d(TAG, "onBindViewHolder: " + adapterHolder.mCity + adapterHolder.mCountry);
    }


    @Override
    public int getItemCount() {
        return mCountryList.size();
    }

    public class AdapterHolder extends RecyclerView.ViewHolder {

        private TextView mCountry;
        private TextView mCity;
        private View mView;

        public AdapterHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            mCountry = itemView.findViewById(R.id.il_tv_country);
            mCity = itemView.findViewById(R.id.it_tv_city);
        }

        public void setCity(String city) {
            mCity.setText(city);
        }

        public void setCountry(String country) {
            mCountry.setText(country);
        }

    }
}
