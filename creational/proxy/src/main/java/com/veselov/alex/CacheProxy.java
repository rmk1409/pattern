package com.veselov.alex;

public class CacheProxy implements DBService {
    private DBService service;
    private String lastUpdate;
    private String data;

    public CacheProxy(DBService service) {
        this.service = service;
    }

    @Override
    public String execute() {
        if (this.service.lastUpdate().equals(this.lastUpdate)) {
            System.out.println("Getting data from Cache...");
            return this.data;
        } else {
            System.out.println("Getting data from Service...");
            this.lastUpdate = this.service.lastUpdate();
            this.data = this.service.execute();
        }
        return this.data;
    }

    @Override
    public String lastUpdate() {
        return this.lastUpdate;
    }
}
