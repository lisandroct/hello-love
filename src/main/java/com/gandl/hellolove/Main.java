package com.gandl.hellolove;

public class Main {
    public static void main(String[] args) {
        HelloTerminal myTerminal = new HelloTerminal();

        myTerminal.Type("Hello, World");
        myTerminal.Delete();
        myTerminal.Type("Lichi loves Gigi. \u2665");

        myTerminal.Goodbye();
    }
}