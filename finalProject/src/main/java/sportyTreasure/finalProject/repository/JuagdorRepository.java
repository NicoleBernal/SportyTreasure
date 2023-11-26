package sportyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportyTreasure.finalProject.entity.Jugador;
@Repository
public interface JuagdorRepository extends JpaRepository<Jugador,Long> {
}
