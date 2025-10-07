package org.esprim.tp_foyer.Repositories;

import org.esprim.tp_foyer.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
}
