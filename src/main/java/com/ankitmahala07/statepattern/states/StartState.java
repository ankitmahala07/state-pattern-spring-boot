package com.ankitmahala07.statepattern.states;

import com.ankitmahala07.statepattern.contexts.StateContext;
import com.ankitmahala07.statepattern.interfaces.State;

public class StartState implements State {
    @Override
    public void doAction(StateContext context) {
        System.out.println("Game session is in start state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Start state.";
    }
}
