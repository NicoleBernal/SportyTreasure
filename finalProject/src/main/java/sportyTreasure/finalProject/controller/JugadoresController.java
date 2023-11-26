package sportyTreasure.finalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportyTreasure.finalProject.entity.Jugador;
import sportyTreasure.finalProject.service.JugadorService;

@RestController
@RequestMapping("/jugadores")
public class JugadoresController {
    @Autowired
    JugadorService jugadorService;

    @PostMapping
    public ResponseEntity<Jugador> registrarJugador(@RequestBody Jugador jugador){
        return ResponseEntity.ok(jugadorService.guardarjugador(jugador));
    }
}
