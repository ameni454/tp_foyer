package org.esprim.tp_foyer.Repositories;

import org.esprim.tp_foyer.entity.Chambre;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
