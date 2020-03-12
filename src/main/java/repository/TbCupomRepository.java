package repository;

import model.Cliente;
import model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository

public interface TbCupomRepository extends JpaRepository<Cupom,Long>{

    List<Cupom> findByIdCliente(Cliente idCliente);
    List<Cupom> findByDtVenda(String dtVenda);
    List<Cupom> findByVlVenda(BigDecimal vlVenda);

    public List<Cupom> findByIdClienteAndDtVenda(Long idCliente,String dtVenda);
}
