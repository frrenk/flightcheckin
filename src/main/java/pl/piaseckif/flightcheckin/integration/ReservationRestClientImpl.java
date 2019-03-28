package pl.piaseckif.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.piaseckif.flightcheckin.integration.dto.Reservation;
import pl.piaseckif.flightcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient{

    private final String url = "http://localhost:8080/flightreservation/reservations/";

    @Override
    public Reservation findReservation(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservation = restTemplate.getForObject(url +id, Reservation.class);
        return reservation;
    }

    @Override

    public Reservation updateReservation(ReservationUpdateRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        Reservation reservation = restTemplate.postForObject(url, request, Reservation.class);
        return reservation;
    }
}
