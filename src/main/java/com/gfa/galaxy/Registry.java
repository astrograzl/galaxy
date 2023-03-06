package com.gfa.galaxy;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Registry extends JpaRepository<Starlog,Long> {
}
