package com.ankitmahala07.statepattern.controllers;

import com.ankitmahala07.statepattern.services.interfaces.IGameSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class StateControllerTest {

    @Mock
    private IGameSession gameSession;

    private StateController stateController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        stateController = new StateController();
        stateController.gameSession = this.gameSession;
    }

    @Test
    public void testUpdateStartState() {

        when(gameSession.startState()).thenReturn("Start state.");

        ResponseEntity<String> response = stateController.updateStartState();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Start state.", response.getBody());
        verify(gameSession, times(1)).startState();
        verifyNoMoreInteractions(gameSession);
    }

    @Test
    public void testUpdateStopState() {

        when(gameSession.stopState()).thenReturn("Stop state.");

        ResponseEntity<String> response = stateController.updateStopState();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Stop state.", response.getBody());
        verify(gameSession, times(1)).stopState();
        verifyNoMoreInteractions(gameSession);
    }
}
