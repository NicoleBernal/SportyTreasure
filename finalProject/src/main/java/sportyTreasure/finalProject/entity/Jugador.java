package sportyTreasure.finalProject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import  lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jugadores")
public class Jugador {
    @Id
    private Long id;
    @Column
    private String contrasenia;
    @Column
    private String nombre;
    @Column
    private  int edad;
    @Column
    private Long telefono;
    @Column
    private String correo;
    @Column
    private String geolocalizacion;

    public void iniciarSesion(){

    }
    public void cerrarSesion(){

    }
}
