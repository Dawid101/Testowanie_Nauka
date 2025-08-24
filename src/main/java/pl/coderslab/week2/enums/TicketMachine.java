package pl.coderslab.week2.enums;

import java.math.BigDecimal;
import java.util.Scanner;

public class TicketMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj typ biletu:");
        String ticketType = scanner.nextLine().toUpperCase();
        try{
            Ticket ticket = new Ticket(TicketType.valueOf(ticketType));
            System.out.println(calculatePrice(ticket) + " zł");
        }catch (IllegalArgumentException e){
            System.out.println("Zły typ biletu");
        }

    }

    public static BigDecimal calculatePrice(Ticket ticket){
        return ticket.getTicketType().getPrice();
    }
}
