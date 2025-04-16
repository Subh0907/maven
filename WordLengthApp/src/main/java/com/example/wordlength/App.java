package com.example.wordlength;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        System.out.println("Length of the word: " + input.length());
        scanner.close();
    }
}
