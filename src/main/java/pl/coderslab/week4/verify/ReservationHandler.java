package pl.coderslab.week4.verify;

public interface ReservationHandler {
    boolean canHandleReservation(Reservation reservation);
    void prepare(Reservation reservation);
}
