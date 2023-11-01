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
public class Actividad{
    private Long id;
    private String actividad;
    private String descripcion;
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