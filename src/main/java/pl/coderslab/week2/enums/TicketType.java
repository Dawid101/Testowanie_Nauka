package pl.coderslab.week2.enums;

import java.math.BigDecimal;

public enum TicketType {
    NORMAL(10),
    STUDENT(7),
    CHILD(5),
    SENIOR(6);

    private final BigDecimal price;

    TicketType(int price){
        this.price = BigDecimal.valueOf(price);
    }

    public BigDecimal getPrice(){
        return price;
    }
}
