package controller;


import model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.TbCupomRepository;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController

public class TbCupomController {

    @Autowired
    private TbCupomRepository tbCupomRepository;

    @GetMapping("/consulta")
    public ResponseEntity<List<Cupom>> findByIdClientAndDtVenda(@PathParam("dCliente") Long idCliente,
                                                                @PathParam("dtVenda") String dtVenda) {

        List<Cupom> listaCupom = new ArrayList<>();

        if (idCliente != null && dtVenda != null) {
            listaCupom = tbCupomRepository.findByIdClienteAndDtVenda(idCliente, dtVenda);
        } else if (idCliente != null) {
            listaCupom.add(tbCupomRepository.findById(idCliente).get());
        }else if(dtVenda != null){
            listaCupom = tbCupomRepository.findByDtVenda(dtVenda);
        }

        if (listaCupom != null && listaCupom.size() > 0){
            return ResponseEntity.ok().body(listaCupom);
        }else{
            return ResponseEntity.badRequest().build();
        }
    }


}
