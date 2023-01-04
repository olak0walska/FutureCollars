package org.example.lesson3task1;

public class Seat {
    int seatNumber;
    int rowNumber;
    boolean isThatSeatTaken;

    public Seat() {
    }

    public Seat(int seatNumber, int rowNumber, boolean isThatSeatTaken) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.isThatSeatTaken = isThatSeatTaken;
    }
}