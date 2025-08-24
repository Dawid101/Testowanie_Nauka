package pl.coderslab.week2.enums;

import java.math.BigDecimal;

public class Ticket {
    private TicketType ticketType;

    public Ticket( TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

}
