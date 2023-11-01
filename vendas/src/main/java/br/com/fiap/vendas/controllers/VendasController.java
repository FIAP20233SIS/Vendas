package br.com.fiap.vendas.controllers;

import br.com.fiap.vendas.dtos.VendasRecordDTO;
import br.com.fiap.vendas.models.VendasModel;
import br.com.fiap.vendas.repositories.VendasRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class VendasController {

    @Autowired
    VendasRepository vendasRepository;

    @PostMapping("/vendas")
    public ResponseEntity<VendasModel> insercaoVenda(@Valid @RequestBody VendasRecordDTO vendaDTO){
        Instant data = Instant.now();

        var vendasModel = new VendasModel();

        BeanUtils.copyProperties(vendaDTO, vendasModel);
        vendasModel.setDtVenda(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(vendasRepository.save(vendasModel));
    }

}
