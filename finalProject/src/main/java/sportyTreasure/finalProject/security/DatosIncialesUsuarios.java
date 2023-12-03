package sportyTreasure.finalProject.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import sportyTreasure.finalProject.entity.Usuario;
import sportyTreasure.finalProject.entity.UsuarioRole;
import sportyTreasure.finalProject.repository.UsuarioRepository;
import sportyTreasure.finalProject.service.UsuarioService;

import java.util.Optional;

@Component
public class DatosIncialesUsuarios implements ApplicationRunner {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioService usuarioService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        //necesito crear un usuario como si fuese real
        //necesito guardarlo en la bdd
        BCryptPasswordEncoder cifrador= new BCryptPasswordEncoder();
        String passCinfrar= "digital";
        String passCifrado= cifrador.encode(passCinfrar);
        System.out.println("Clave cifrada: "+passCifrado);
        //crear un usuario
        Usuario usuario1= new Usuario("1006875352","Nicole","Bernal","nmbernal",20,"3504914163","nmbernal@unillanos.edu.co",passCifrado, UsuarioRole.ROLE_ADMIN);
        Optional<Usuario> usuarioOptional = usuarioRepository.findByDocumento(usuario1.getDocumento());
        if(usuarioOptional.isPresent()) {
            System.out.println("El usuario ya existe en la base de datos.");
        }
        else{
            usuarioRepository.save(usuario1);
            System.out.println("Usuario guardado exitosamente.");
        }
        System.out.println("HOLA");

    }
}
