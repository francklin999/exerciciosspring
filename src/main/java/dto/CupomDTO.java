package dto;

import lombok.*;
import model.Cliente;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CupomDTO {

    private Long idCupom;
    private Cliente idCliente;
    private String dtVenda;
    private BigDecimal valorVenda;

}
