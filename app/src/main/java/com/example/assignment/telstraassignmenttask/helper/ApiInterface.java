package com.example.assignment.telstraassignmenttask.helper;

import com.example.assignment.telstraassignmenttask.model.CountryListModel;

import retrofit2.Call;
import retrofit2.http.GET;

public abstract class ApiInterface {
    @GET("marvel")
    public abstract Call<CountryListModel> getCountryDetails();
}
