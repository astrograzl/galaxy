package com.gfa.galaxy;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class Machine {
    private final Registry registry;

    @Autowired
    public Machine(Registry registry) {
        this.registry = registry;
    }

    public ResponseEntity<List<Starlog>> get() {
        return ResponseEntity.ok(this.registry.findAll());
    }

    public ResponseEntity<Starlog> get(Long id) {
        return ResponseEntity.ok(this.registry.findById(id).orElse(null));
    }

    public ResponseEntity<Starlog> save(Starlog starlog) {
        return ResponseEntity.ok(this.registry.save(starlog));
    }
}
