package pl.coderslab.week4.verify;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reservation {
    private Long id;
    private String name;
    private String lastName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private ReservationStatus reservationStatus;

    public Reservation(Long id, String name, String lastName, LocalDate checkInDate, LocalDate checkOutDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
