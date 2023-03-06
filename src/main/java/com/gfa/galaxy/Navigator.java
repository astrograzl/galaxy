package com.gfa.galaxy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Navigator {
    private final Engine engine;

    @Autowired
    public Navigator(Engine engine) {
        this.engine = engine;
    }

    @GetMapping({"", "/"})
    public ResponseEntity<?> index() {
        return ResponseEntity.ok(null);
    }
}
