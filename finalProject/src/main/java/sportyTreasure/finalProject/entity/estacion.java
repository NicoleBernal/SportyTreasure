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
public class Estacion{
    private long id;
    private String nombre;
    private String descripcion;
    private Pista pista;
    private Actividad actividad;
    private String geolocalización;

    public Actividad siguienteActividad() {
        return actividad;
    }
}