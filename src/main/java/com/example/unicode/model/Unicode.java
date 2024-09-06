package com.example.unicode.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int unicode;
    private char letter;
    private String description;
    private String name;

    public Long getId() {
        return id;
    }

    public int getUnicode() {
        return unicode;
    }

    public char getLetter() {
        return letter;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
}
