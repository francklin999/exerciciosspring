package model;



import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente" )
    private Long idCliente;

    @Column(name = "ds_nome")
    private String nome;

    @Column(name = "ds_sobrenome")
    private String sobrenome;

    @Column(name = "nr_idade")
    private String idade;

}
