package sportyTreasure.finalProject.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="actividades")
public class Actividad{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String actividad;
    @Column
    private String descripcion;
    @Column
    private int puntaje;

    public boolean validarPuntaje(){
        if(puntaje>=6){
            return true;
        }
        else{
            return false;
        }
    }


};