package pl.coderslab.week4.verify;

public class ReservationService {
    private final ReservationHandler reservationHandler;

    public ReservationService(ReservationHandler reservationHandler) {
        this.reservationHandler = reservationHandler;
    }

    public Reservation processReservation(Reservation reservation) {
        if (reservationHandler.canHandleReservation(reservation)) {
            reservationHandler.prepare(reservation);
            reservation.setReservationStatus(ReservationStatus.CONFIRMED);
        } else {
            reservation.setReservationStatus(ReservationStatus.REJECTED);
        }
        return reservation;
    }
}
