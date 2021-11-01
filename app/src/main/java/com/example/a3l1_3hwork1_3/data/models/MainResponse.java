
package com.example.a3l1_3hwork1_3.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MainResponse {

    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("results")
    @Expose
    private List<Charakter> results = null;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Charakter> getResults() {
        return results;
    }

    public void setResults(List<Charakter> results) {
        this.results = results;
    }

}
