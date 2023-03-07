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
        final int length = 256; // 128
        final int contentLength = this.content.length();
        return contentLength > length ?
                this.content.substring(0, length) :
                this.content.substring(0, contentLength);
    }
}
