package com.gfa.galaxy;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class Machine {
    private final Register register;

    @Autowired
    public Machine(Register register) {
        this.register = register;
    }

    public ResponseEntity<List<Starlog>> get() {
        return ResponseEntity.ok(this.register.findAll());
    }

    public ResponseEntity<Starlog> get(Long id) {
        return ResponseEntity.ok(this.register.findById(id).orElse(null));
    }

    public ResponseEntity<Starlog> save(Starlog starlog) {
        return ResponseEntity.ok(this.register.save(starlog));
    }
}
