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
public class Pista{
    private Long id;
    private String acertijo;
    private String respuesta;
    private String ubicación;
    public String ubicaciónSiguiente(){
        return ubicación;
    }
    public boolean validarRespuesta(){
        return respuesta;
    }
}