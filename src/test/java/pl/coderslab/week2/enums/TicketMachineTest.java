package pl.coderslab.week2.enums;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static pl.coderslab.week2.enums.TicketType.*;

class TicketMachineTest {

    @Test
    void checkTicketPriceIfNormal(){
        Ticket ticket = new Ticket(NORMAL);
        assertEquals(BigDecimal.valueOf(10),TicketMachine.calculatePrice(ticket));
    }

    @Test
    void checkTicketPriceIfStudent(){
        Ticket ticket = new Ticket(STUDENT);
        assertEquals(BigDecimal.valueOf(7),TicketMachine.calculatePrice(ticket));
    }

    @Test
    void checkTicketPriceIfSenior(){
        Ticket ticket = new Ticket(SENIOR);
        assertEquals(BigDecimal.valueOf(6),TicketMachine.calculatePrice(ticket));
    }

    @Test
    void checkTicketPriceIfChild(){
        Ticket ticket = new Ticket(CHILD);
        assertEquals(BigDecimal.valueOf(5),TicketMachine.calculatePrice(ticket));
    }



}