package sportyTreasure.finalProject.entity;
import lombok.*;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="pistas")
public class Pista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pista;
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
