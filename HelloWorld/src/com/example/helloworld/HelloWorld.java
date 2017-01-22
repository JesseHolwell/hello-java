package com.example.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jesse on 22/01/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String response;

        System.out.println("What is the air-speed velocity of an unladen swallow?");

        try {
            response = reader.readLine();
            if (response.toLowerCase().contains("african or european")) {
                System.out.println("What? I don't know that! Auuuugh");
                System.out.println("You win.");
            } else
                System.out.println("You die.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}