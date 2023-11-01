package br.com.fiap.vendas.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity(name = "TB_VENDAS")
@Table(name = "TB_VENDAS")
public class VendasModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVenda;

    @Column (nullable = false)
    private int idProduto;

    @Column (nullable = false)
    private int idCliente;

    @Column(nullable = false, updatable = false)
    private Instant dtVenda;


    @Column (nullable = false)
    private double valor;

    @Column (nullable = false)
    private int quantidade;

}
