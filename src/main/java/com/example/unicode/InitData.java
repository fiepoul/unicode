package com.example.unicode;

import com.example.unicode.model.Unicode;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.unicode.repository.UnicodeRepository;

import java.util.Set;

@Component
public class InitData {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @PostConstruct
    public void init() {
        Set<Character> characters = Set.of('a', 'b', 'c', 'd', 'e', '$', '#', '€');

        for (char c : characters) {
            Unicode unicode = new Unicode();
            unicode.setUnicode((int) c);
            unicode.setLetter(c);
            unicode.setDescription("Some description for " + c);
            unicode.setName("Character " + c);
            unicodeRepository.save(unicode);
        }
    }
}
