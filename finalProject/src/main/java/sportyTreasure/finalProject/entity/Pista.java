package sportyTreasure.finalProject.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="pistas")
public class Pista {
    @Id
    private Long id;
    @Column
    private String acertijo;
    @Column
    private String respuesta;
    @Column
    private String ubicacionSig;

    public boolean validarRespuesta(){
        return true;
    }
}
