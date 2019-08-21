package com.veselov.alex;

public class Command3 implements Command {
    private Receiver2 receiver;

    public Command3(Receiver2 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action2();
    }
}
