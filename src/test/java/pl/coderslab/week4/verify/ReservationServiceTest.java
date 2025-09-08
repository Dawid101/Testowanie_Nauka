package pl.coderslab.week4.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ReservationServiceTest {

    @Test
    void checkReservationStatusIfConfirmed() {
        ReservationHandler mockReservationHandler = mock(ReservationHandler.class);
        ReservationService reservationService = new ReservationService(mockReservationHandler);

        Reservation reservation = new Reservation(1L, "John", "Doe", LocalDate.now(), LocalDate.now().plusDays(5));
        when(mockReservationHandler.canHandleReservation(reservation)).thenReturn(true);

        Reservation processReservation = reservationService.processReservation(reservation);

        assertEquals(ReservationStatus.CONFIRMED, processReservation.getReservationStatus());
        InOrder inOrder = inOrder(mockReservationHandler);
        inOrder.verify(mockReservationHandler).canHandleReservation(reservation);
        inOrder.verify(mockReservationHandler).prepare(reservation);
    }

    @Test
    void checkReservationStatusIfRejected() {
        ReservationHandler mockReservationHandler = mock(ReservationHandler.class);
        ReservationService reservationService = new ReservationService(mockReservationHandler);

        Reservation reservation = new Reservation(1L, "John", "Doe", LocalDate.now(), LocalDate.now().plusDays(5));
        when(mockReservationHandler.canHandleReservation(reservation)).thenReturn(false);

        Reservation processReservation = reservationService.processReservation(reservation);

        assertEquals(ReservationStatus.REJECTED, processReservation.getReservationStatus());
        verify(mockReservationHandler, never()).prepare(reservation);
    }



}