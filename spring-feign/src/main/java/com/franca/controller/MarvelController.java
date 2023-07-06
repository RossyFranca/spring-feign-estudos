package com.franca.controller;

import com.franca.api.DefaultApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/marvel")
public class MarvelController {
    String apiKey = "9efa9bb1b2a8697c286de016da400093";
    String privateKey = "94ced704fbe4b146ba7afe59084ec52e4b5107aa";
    @Autowired
    private DefaultApiClient defaultApiClient;

    private StringBuffer returnHash(String md5) throws NoSuchAlgorithmException, CloneNotSupportedException {
        MessageDigest md = MessageDigest.getInstance("md5");
        byte[] array = md.digest(md5.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
            sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
        }
        return sb;
    }

    @GetMapping("personagens")
    public ResponseEntity<model.CharacterDataWrapper> buscarPersonagens(
            @RequestParam String id) throws NoSuchAlgorithmException, CloneNotSupportedException {

        String baseHash = "1" + privateKey + apiKey;
        String hash = String.valueOf(returnHash(baseHash));
        return defaultApiClient.characterById(
                id,
                "1",
                "9efa9bb1b2a8697c286de016da400093",
                hash);

    }
}
