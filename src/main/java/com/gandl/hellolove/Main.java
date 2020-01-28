package com.gandl.hellolove;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        defaultTerminalFactory.setTerminalEmulatorTitle("Terminal");

        Terminal terminal = null;
        try {
            terminal = defaultTerminalFactory.createTerminal();

            Writer.print(terminal, "Test");
            Writer.backspace(terminal, "Test", 2);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            if(terminal != null) {
                try {
                    Thread.sleep(5000);
                    terminal.putCharacter('\n');
                    terminal.flush();
                    terminal.close();
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}