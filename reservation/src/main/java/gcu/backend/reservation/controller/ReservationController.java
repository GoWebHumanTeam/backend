package gcu.backend.reservation.controller;

import gcu.backend.reservation.domain.Reservation;
import gcu.backend.reservation.repository.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class ReservationController {

    final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // POST, reservation
    @PostMapping("/api/reservation")
    public String create(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
        return "reservation ok";
    }

    // DELETE, reservation
    @DeleteMapping("/api/reservation")
    public String delete() {
        reservationRepository.deleteById(1L);
        return "delete ok";
    }

    // GET, reservation
    @GetMapping("/api/reservation")
    public Optional<Reservation> getReservation() {
        return reservationRepository.findById(1L);
    }


}
