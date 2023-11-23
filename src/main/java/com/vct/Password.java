package com.vct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Password {

    private String password;
    private final String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String generatePassword(int i) {
        String passTmp = "";
        int size = this.getCharset().length();
        Random rand = new Random();
        for(int a = 0; a < i; a++) {
            int tmp = rand.nextInt(size);
            passTmp += this.getCharset().charAt(tmp);
        }
        return passTmp;
    }



}
