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
@Table(name="estaciones")
public class Estacion {
    @Id
    private Long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String geolocalizacion;
    @OneToOne
    private Actividad actividad;
    @OneToOne
    private Pista pista;


    public Actividad siguienteActividad(){
        return actividad;
    }

}
