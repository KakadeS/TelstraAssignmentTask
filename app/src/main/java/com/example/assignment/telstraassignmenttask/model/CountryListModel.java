package com.example.assignment.telstraassignmenttask.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CountryListModel {
//    @SerializedName("rows")
    public String title;
    private ArrayList<Country> rows;

    public ArrayList<Country> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Country> rows) {
        this.rows = rows;
    }
}
