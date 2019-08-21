package com.veselov.alex;

public class Command1 implements Command {
    private Receiver1 receiver;

    public Command1(Receiver1 receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
