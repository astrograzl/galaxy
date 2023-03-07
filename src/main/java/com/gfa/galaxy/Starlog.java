package com.gfa.galaxy;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "starlogs")
public class Starlog {
    @JsonIgnore private Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore @Id private Long id;
    private String title;
    private String content;
    public String getContent() {
        final int length = 128;
        return this.content.length() < length ? this.content :
                this.content.substring(0, length);

    }
}
