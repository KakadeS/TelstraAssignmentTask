package com.example.assignment.telstraassignmenttask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assignment.telstraassignmenttask.viewmodel.CountryViewModel;

public class CountryDetailFragment extends Fragment {
    private CountryViewModel countryViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.activity_container, container, false);
    }

}
