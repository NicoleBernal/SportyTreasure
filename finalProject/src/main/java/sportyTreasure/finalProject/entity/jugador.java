package sportyTreasure.finalProject.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {
    private Long id;
    private String contrasenia;
    private String nombre;
    private int edad;
    private Long telefono;
    private String correo;
    private String geolocalizacion;

    public void iniciarSesion(){

    }
    public void cerrarSesion(){

    }
};