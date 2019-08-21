package com.veselov.alex;

public class Command2 implements Command {
    private Receiver2 receiver;

    public Command2(Receiver2 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
