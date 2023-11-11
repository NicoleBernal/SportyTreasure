package sportyTreasure.finalProject.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import sportyTreasure.finalProject.entity.Actividad;
import sportyTreasure.finalProject.repository.ActividadRespository;

import java.util.Optional;

@Service
public class ActividadService {
    private ActividadRespository actvidadRespository;
    public Optional<Actividad> buscarActvidad(){
        Long id=(long)Math.floor(Math.random()*10);
        return actvidadRespository.findById(id);}
}
