package com.gfa.galaxy;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "starlogs")
public class Starlog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id private Long id;
    private Timestamp timestamp;
}
