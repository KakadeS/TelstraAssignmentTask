package com.example.assignment.telstraassignmenttask.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

import com.example.assignment.telstraassignmenttask.model.Country;

public class CountryItemViewModel extends BaseObservable {
    private Country dataModel;

    public CountryItemViewModel(Country dataModel) {
        this.dataModel = dataModel;
    }

    public Country getDataModel() {
        return dataModel;
    }

    public void setDataModel(Country dataModel) {
        this.dataModel = dataModel;
    }

    @Bindable
    public String getTitle() {
        return !TextUtils.isEmpty(dataModel.getTitle()) ? dataModel.getTitle() : "";
    }
    @Bindable
    public  String getDescription() {
        return !TextUtils.isEmpty(dataModel.getDescription()) ? dataModel.getDescription() : "";
    }

    @Bindable
    public  String getImageHref() {
        return !TextUtils.isEmpty(dataModel.getImageHref()) ? dataModel.getImageHref() : "";
    }

}
