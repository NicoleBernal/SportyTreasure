package sportyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportyTreasure.finalProject.entity.Estacion;
@Repository
public interface EstacionRepository extends JpaRepository<Estacion,Long> {
}
