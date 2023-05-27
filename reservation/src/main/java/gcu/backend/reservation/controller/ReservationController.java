package gcu.backend.reservation.controller;

import gcu.backend.reservation.domain.Reservation;
import gcu.backend.reservation.repository.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("http://localhost:8000")
@RestController
public class ReservationController {

    private final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // POST, reservation
    @RequestMapping(value = "/api/reservation/post", method = RequestMethod.POST)
    public Long create(@RequestBody Reservation reservation) {
        Reservation saveReservation = reservationRepository.save(reservation);
        return saveReservation.getId();
    }

    // DELETE, reservation
    @DeleteMapping("/api/reservation/delete")
    public String delete() {
        reservationRepository.deleteById(1L);
        return "delete ok";
    }

    // GET, reservation
    @GetMapping("/api/reservation/get")
    public Optional<Reservation> getReservation() {
        return reservationRepository.findById(1L);
    }


}
