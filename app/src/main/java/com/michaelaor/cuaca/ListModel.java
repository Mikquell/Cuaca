package com.michaelaor.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListModel
{
    @SerializedName("main")
    private MainModel mainModel;
    @SerializedName("weater")
    private List<WeaterModel> weaterModels;
    private String dt_txt;

    public ListModel() {}

    public MainModel getMainModel() {
        return mainModel;
    }

    public void setMainModel(MainModel mainModel) {
        this.mainModel = mainModel;
    }

    public List<WeaterModel> getWeaterModels() {
        return weaterModels;
    }

    public void setWeaterModelsList(List<WeaterModel> weaterModels) {
        this.weaterModels = weaterModels;
    }

    public String getDt_txt() {
        return dt_txt;
    }
    
}
