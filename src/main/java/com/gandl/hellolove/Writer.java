package com.gandl.hellolove;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Writer {
    public static void print(Terminal terminal, String string) {
        try {
            Thread.sleep(700);
            terminal.clearScreen();
            terminal.setCursorPosition(0, 0);
            for(int i = 0, n = string.length(); i < n; i++) {
                terminal.putCharacter(string.charAt(i));
                terminal.flush();
                Thread.sleep(300);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void backspace(Terminal terminal, String string, int count) {
        try {
            Thread.sleep(700);
            for(int i = 0; i <= count; i++) {
                terminal.clearScreen();
                terminal.setCursorPosition(0, 0);
                for(int j = 0, n = string.length() - i; j < n; j++) {
                    terminal.putCharacter(string.charAt(j));
                }
                terminal.flush();
                Thread.sleep(300);
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
