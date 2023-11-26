package sportyTreasure.finalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sportyTreasure.finalProject.entity.Actividad;

@Repository
public interface ActividadRespository extends JpaRepository<Actividad,Long> {
}
