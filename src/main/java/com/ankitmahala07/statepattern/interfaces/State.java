package com.ankitmahala07.statepattern.interfaces;

import com.ankitmahala07.statepattern.contexts.StateContext;

public interface State {
    void doAction(StateContext context);
}
