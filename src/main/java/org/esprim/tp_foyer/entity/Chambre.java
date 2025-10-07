package org.esprim.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private java.util.List<Reservation> reservations;
}
