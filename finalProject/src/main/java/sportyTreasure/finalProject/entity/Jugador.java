package sportyTreasure.finalProject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="jugadores")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String contrasenia;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String usuario;
    @Column
    private  int edad;
    @Column
    private Long telefono;
    @Column
    private String correo;
    @Column
    private String geolocalizacion;
    @OneToMany
    private List<Estacion> estaciones;

    public void iniciarSesion(){

    }
    public void cerrarSesion(){

    }
}
