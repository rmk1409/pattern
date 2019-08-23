package com.veselov.alex;

import java.util.Date;

public class CachedService implements DBService {
    private String data;
    private String lastUpdateDate;

    public CachedService() {
        this.lastUpdateDate = new Date().toString();
        this.data = "Some data";
    }

    @Override
    public String execute() {
        return this.data;
    }

    @Override
    public String lastUpdate() {
        return this.lastUpdateDate;
    }

    public void setData(String data) {
        this.lastUpdateDate = new Date().toString();
        this.data = data;
    }
}
