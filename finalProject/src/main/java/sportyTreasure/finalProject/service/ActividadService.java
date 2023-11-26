package sportyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import sportyTreasure.finalProject.entity.Actividad;
import sportyTreasure.finalProject.repository.ActividadRespository;

import java.util.Optional;

@Service
public class ActividadService {
    @Autowired
    private ActividadRespository actividadRespository;

    public Actividad guardarActividad(Actividad actividad){
        return actividadRespository.save(actividad);

    }
    public Optional<Actividad> buscarActvidad(){
        Long id=(long)Math.floor(Math.random()*10);
        return actividadRespository.findById(id);}
}
