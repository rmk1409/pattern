package com.veselov.alex;

public class Invoker {
    private Command cmd1;
    private Command cmd2;
    private Command cmd3;

    public void setCmd1(Command cmd1) {
        this.cmd1 = cmd1;
    }

    public void setCmd2(Command cmd2) {
        this.cmd2 = cmd2;
    }

    public void setCmd3(Command cmd3) {
        this.cmd3 = cmd3;
    }

    void doWork1(){
        this.cmd1.execute();
    }

    void doWork2(){
        this.cmd2.execute();
    }

    void doWork3(){
        this.cmd3.execute();
    }
}
