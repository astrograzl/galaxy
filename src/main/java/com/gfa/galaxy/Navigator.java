package com.gfa.galaxy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class Navigator {
    private final Machine machine;

    @Autowired
    public Navigator(Machine machine) {
        this.machine = machine;
    }

    @GetMapping({"", "/"})
    public ResponseEntity<List<Starlog>> index() {
        return this.machine.get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Starlog> show(@PathVariable Long id) {
        return this.machine.get(id);
    }

    @PutMapping("/")
    public ResponseEntity<Starlog> store(@RequestBody Starlog starlog) {
        return this.machine.save(starlog);
    }
}
