package service;

import dto.CupomDTO;
import model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import repository.TbCupomRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("CupomService")

public class CupomService {

    @Autowired
    TbCupomRepository tbCupomRepository;

    public ResponseEntity consulta(CupomDTO cupom) {

        if (cupom ==  null || cupom.getIdCliente() == null)
            return ResponseEntity.badRequest().body(new Exception("Cliente não informado"));

        if (cupom.getDtVenda() == null)
            return ResponseEntity.badRequest().body(new Exception("Data da venda errada"));

        Cupom cupons = new Cupom();
        cupons.setIdCupom(cupom.getIdCupom());
        cupons.setIdCliente(cupom.getIdCliente());
        cupons.setDtVenda(cupom.getDtVenda());
        cupons.setValorVenda(cupom.getValorVenda());

        List<Cupom> listaCupons = new ArrayList<>();
        for ()


    }
}
