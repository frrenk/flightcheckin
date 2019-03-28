package pl.piaseckif.flightcheckin.integration;

import org.springframework.stereotype.Component;
import pl.piaseckif.flightcheckin.integration.dto.Reservation;
import pl.piaseckif.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

    public Reservation findReservation(Long id);

    public Reservation updateReservation(ReservationUpdateRequest request);
}
