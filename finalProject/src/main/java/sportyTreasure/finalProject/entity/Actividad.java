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
@Table(name="actividades")
public class Actividad{
    @Id
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