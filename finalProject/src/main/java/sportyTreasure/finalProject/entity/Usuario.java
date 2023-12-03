package sportyTreasure.finalProject.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="usuarios")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Column
    private String documento;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String usuario;
    @Column
    private  int edad;
    @Column
    private String telefono;
    @Column
    private String correo;
    @Column
    private String contrasenia;
    @Column
    private UsuarioRole rol;
    @Column
    private String geolocalizacion;

    public Usuario(String documento,String nombre, String apellido, String usuario, int edad, String telefono, String correo, String contrasenia, UsuarioRole rol) {
        this.documento=documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return contrasenia;
    }

    @Override
    public String getUsername() {
        return usuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
