package com.veselov.alex;

public class SecurityProxy implements Service {
    private Service service;
    private boolean flag;

    public SecurityProxy(Service service) {
        this.service = service;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void execute() {
        if (isFlag()) {
            service.execute();
        } else {
            System.out.println("You don't have proper rights...");
        }
    }
}
