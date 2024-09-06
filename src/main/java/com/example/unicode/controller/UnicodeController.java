package com.example.unicode.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String getUnicode(@PathVariable int i) {
        char c = (char) i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/char/{c}")
    public String getCharUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char=" + c + " unicode=" + unicode;
    }

    @GetMapping("/chars/{start}/{count}")
    public String getChars(@PathVariable char start, @PathVariable int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            char currentChar = (char) (start + i);
            result.append(currentChar).append(" ");
        }

        return result.toString();
    }
}
