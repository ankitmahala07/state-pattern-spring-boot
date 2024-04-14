package com.ankitmahala07.statepattern.controllers;

import com.ankitmahala07.statepattern.services.interfaces.IGameSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateController {

    @Autowired
    public IGameSession gameSession;

    @PutMapping("/start")
    public ResponseEntity<String> updateStartState(){
        return ResponseEntity.ok(gameSession.startState());
    }

    @PutMapping("/stop")
    public ResponseEntity<String> updateStopState(){
        return ResponseEntity.ok(gameSession.stopState());
    }

}
