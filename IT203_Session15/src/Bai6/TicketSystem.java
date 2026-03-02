package Bai6;

import java.util.LinkedList;
import java.util.Queue;

class TicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.add(t);
        return t;
    }

    public Ticket callNextTicket() {
        if (ticketQueue.isEmpty()) return null;
        return ticketQueue.poll();
    }

    public void displayTickets() {
        System.out.println("=== Danh sách số thứ tự đang chờ ===");
        for (Ticket t : ticketQueue) {
            System.out.println(t);
        }
    }
}
