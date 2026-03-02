package Bai6;

import java.util.LinkedList;
import java.util.Queue;

class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Ticket: " + ticketNumber + " | Issued: " + issuedTime;
    }
}


