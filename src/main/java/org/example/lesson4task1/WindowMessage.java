package org.example.lesson4task1;

public class WindowMessage extends Message {
    public WindowMessage(String className) {
        super(className);
    }

    @Override
    public String getMessage() {
        return "This is class " + className;
    }
}
