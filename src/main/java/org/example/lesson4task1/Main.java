package org.example.lesson4task1;

public class Main {
    public static void main(String[] args) {
        WindowMessage windowMessage = new WindowMessage("WindowMessage");
        System.out.println(windowMessage.getMessage());

        ConsoleMessage consoleMessage = new ConsoleMessage("ConsoleMessage");
        System.out.println(consoleMessage.getMessage());
    }
}