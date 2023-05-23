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
    @PostMapping("/api/reservation/{member_id}")
    public String create(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
        return "reservation ok";
    }

    // DELETE, reservation
    @DeleteMapping("/api/reservation/{member_id")
    public String delete(@PathVariable Long member_id) {
        reservationRepository.deleteById(member_id);
        return "delete ok";
    }

    // GET, reservation
    @GetMapping("/api/reservation/{member_id}")
    public Optional<Reservation> getReservation(@PathVariable("member_id") Long id) {
        return reservationRepository.findById(id);
    }


}
