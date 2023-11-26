package sportyTreasure.finalProject.repository;
import org.springframework.stereotype.Repository;
import sportyTreasure.finalProject.entity.Pista;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PistaRepository extends JpaRepository <Pista,Long> {
}
