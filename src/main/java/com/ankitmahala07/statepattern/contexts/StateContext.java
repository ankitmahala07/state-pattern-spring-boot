package com.ankitmahala07.statepattern.contexts;

import com.ankitmahala07.statepattern.interfaces.State;

/*
* Represents any object whose state we would like to manager e.g., Game Session, Player, Objects, User, Order
 */
public class StateContext {

    private State state;

    public StateContext(){
        this.state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }

}
