package com.gfa.galaxy;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class Engine {
    private final Registry registry;

    @Autowired
    public Engine(Registry registry) {
        this.registry = registry;
    }
}
