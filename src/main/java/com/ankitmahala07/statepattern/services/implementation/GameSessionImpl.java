package com.ankitmahala07.statepattern.services.implementation;

import com.ankitmahala07.statepattern.contexts.StateContext;
import com.ankitmahala07.statepattern.interfaces.State;
import com.ankitmahala07.statepattern.services.interfaces.IGameSession;
import com.ankitmahala07.statepattern.states.StartState;
import com.ankitmahala07.statepattern.states.StopState;
import org.springframework.stereotype.Service;

@Service
public class GameSessionImpl implements IGameSession {

    private final StateContext stateContext = new StateContext();
    private final State startState = new StartState();
    private final State stopState = new StopState();

    @Override
    public String startState(){
        startState.doAction(stateContext);
        return stateContext.getState().toString();
    }

    @Override
    public String stopState(){
        stopState.doAction(stateContext);
        return stateContext.getState().toString();
    }

}
