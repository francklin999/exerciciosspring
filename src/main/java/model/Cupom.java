package model;

import lombok.*;

        import javax.persistence.*;
        import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long idCupom;

    @Column(name = "id_cliente")
    private Cliente idCliente;

    @Column(name = "dt_venda")
    private String dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal valorVenda;
}
