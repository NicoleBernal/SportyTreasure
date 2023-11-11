package sportyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sportyTreasure.finalProject.entity.Jugador;
import sportyTreasure.finalProject.repository.JuagdorRepository;

@Service
public class JugadorService {
    @Autowired
    private JuagdorRepository jugadorRespository;
    public Jugador guardarjugador(Jugador jugador){ return jugadorRespository.save(jugador);}
    public void actualizarJugador(Jugador jugador){ jugadorRespository.save(jugador);}
    public void eliminarJugador(Long id){jugadorRespository.deleteById(id);}
}
