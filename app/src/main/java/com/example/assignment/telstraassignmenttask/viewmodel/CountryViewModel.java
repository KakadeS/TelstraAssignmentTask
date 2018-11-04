package com.example.assignment.telstraassignmenttask.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.assignment.telstraassignmenttask.BR;
import com.example.assignment.telstraassignmenttask.adapter.CountryDataAdapter;
import com.example.assignment.telstraassignmenttask.helper.ApiInterface;
import com.example.assignment.telstraassignmenttask.helper.RetrofitClass;
import com.example.assignment.telstraassignmenttask.model.Country;
import com.example.assignment.telstraassignmenttask.model.CountryListModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryViewModel extends BaseObservable {
    private static final String TAG = "CountryViewModel";
   private CountryDataAdapter adapter;
    private ArrayList<Country> data;

    public CountryViewModel() {
        data = new ArrayList<Country>();
        adapter = new CountryDataAdapter();
    }

    public void setUp() {
        // perform set up tasks, such as adding listeners, data population, etc.
        populateData();
    }

    public void tearDown() {
        // perform tear down tasks, such as removing listeners
    }

    @Bindable
    public List<Country> getData() {

        return this.data;
    }

    @Bindable
    public CountryDataAdapter getAdapter()
    {
        return this.adapter;
    }

    private void populateData() {
        ApiInterface api = RetrofitClass.getRetrofitObject().create(ApiInterface.class);
        Call<CountryListModel> call = api.getCountryDetails();
        call.enqueue(new Callback<CountryListModel>() {
            @Override
            public void onResponse(Call<CountryListModel> call, Response<CountryListModel> response) {
                for (int i = 0; i < response.body().getRows().size(); i++) {
                    data.add(response.body().getRows().get(i));
                }
            }

            @Override
            public void onFailure(Call<CountryListModel> call, Throwable t) {
            }
        });
        notifyPropertyChanged(BR.data);
    }

}
