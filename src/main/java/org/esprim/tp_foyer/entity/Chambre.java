package org.esprim.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

    @ManyToMany(cascade = CascadeType.ALL)
    private java.util.List<Reservation> reservations;
}
