package sportyTreasure.finalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportyTreasure.finalProject.entity.Usuario;
import sportyTreasure.finalProject.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> registrarJugador(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.guardarjugador(usuario));
    }
}
