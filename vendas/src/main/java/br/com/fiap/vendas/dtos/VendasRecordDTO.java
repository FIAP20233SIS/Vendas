package br.com.fiap.vendas.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

public record VendasRecordDTO(

     @NotNull(message = "O id do produto é obrigatorio") int idProduto,

     @NotNull(message = "O id do cliente é obrigatorio") int idCliente,

    String dtVenda,

     @NotNull(message = "O valor da venda é obrigatorio") double valor,

     @NotNull(message = "A quantidade da venda é obrigatorio") int quantidade


) {
}
