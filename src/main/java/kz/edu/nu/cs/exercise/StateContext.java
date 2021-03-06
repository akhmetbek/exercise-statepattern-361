package kz.edu.nu.cs.exercise;

public class StateContext {
    final State state1 = new State1(this);
    final State state2 = new State2(this);
    final State state3 = new State3(this);

    private State currentState;

    public StateContext() {
        this.currentState = state1;
    }

    public void actionA() {
        this.getCurrentState().actionA();
        // delegation to the current state
    }

    public void actionB() {
        this.getCurrentState().actionB();
        // delegate to the current state
    }

    public boolean inAcceptState() {
        return currentState.isAccept();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

}
