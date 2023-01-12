package org.example.lesson3task1;

public class Seat {
    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public void setIsTaken (boolean isTakenParameter){
        isTaken = isTakenParameter;
    }

    public Seat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}