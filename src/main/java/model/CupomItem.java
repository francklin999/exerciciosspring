package model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupomItem;

    @ManyToOne
    @JoinColumn(name = "id_cupom")
    private Cupom idCupom;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto idProduto;

    @Column(name = "qtd_produto")
    private Long quantProduto;

    @Column(name = "vl_produto")
    private BigDecimal valorProduto;

}
