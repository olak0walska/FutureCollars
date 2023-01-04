package org.example.lesson4task1;

public class ConsoleMessage extends Message {
    public ConsoleMessage(String className) {
        super(className);
    }

    @Override
    public String getMessage() {
        return "This is class " + className;
    }
}