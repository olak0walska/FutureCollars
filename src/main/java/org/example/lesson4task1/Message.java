package org.example.lesson4task1;

public abstract class Message {
    public String className;

    public Message(String className) {
        this.className = className;
    }

    public abstract String getMessage();
}
