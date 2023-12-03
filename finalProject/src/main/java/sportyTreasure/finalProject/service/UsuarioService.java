package sportyTreasure.finalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sportyTreasure.finalProject.entity.Usuario;
import sportyTreasure.finalProject.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario guardarjugador(Usuario usuario){ return usuarioRepository.save(usuario);}
    public void actualizarJugador(Usuario usuario){ usuarioRepository.save(usuario);}
    public void eliminarJugador(Long id){usuarioRepository.deleteById(id);}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuarioBuscado= usuarioRepository.findByUsuario(username);
        if(usuarioBuscado.isPresent()) {
            for (int i=0;i<5;i++){
                System.out.println(usuarioBuscado.get());
            }
            return usuarioBuscado.get();
        }
        System.out.println("VALOR NULO");
        return null;
    }
}
