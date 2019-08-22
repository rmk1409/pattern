package com.veselov.alex;

public class Context {
    private State workState = new WorkState(this);
    private State sleepState = new SleepState(this);
    private State eatState = new EatState(this);

    private State currentState = workState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void action(){
        this.currentState.execute();
    }

    public State getWorkState() {
        return workState;
    }

    public void setWorkState(State workState) {
        this.workState = workState;
    }

    public State getSleepState() {
        return sleepState;
    }

    public void setSleepState(State sleepState) {
        this.sleepState = sleepState;
    }

    public State getEatState() {
        return eatState;
    }

    public void setEatState(State eatState) {
        this.eatState = eatState;
    }
}
