package com.gfa.galaxy;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Register extends JpaRepository<Starlog,Long> {
}
