package com.gandl.hellolove;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class HelloTerminal {
    private Terminal terminal;

    private String text;

    public HelloTerminal() {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        defaultTerminalFactory.setTerminalEmulatorTitle("Terminal");

        terminal = null;
        try {
            terminal = defaultTerminalFactory.createTerminal();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void Type(String message) {
        text = message;
        Writer.print(terminal, message);
    }

    public void Delete() {
        if(text == null) { return; }
        Writer.backspace(terminal, text, text.length());
    }

    public void Goodbye() {
        try {
            Thread.sleep(5000);
            terminal.putCharacter('\n');
            terminal.flush();
            terminal.close();
        }
        catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
