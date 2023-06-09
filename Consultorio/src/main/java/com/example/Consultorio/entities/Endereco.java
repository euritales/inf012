package com.example.Consultorio.entities;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @NotNull
    private String logradouro;
    @NotNull
    private String numero;
    private String complemento;
    @NotNull
    private String bairro;
    @NotNull
    private String cidade;
    @NotNull
    private String uf;
    @NotNull
    private String cep;

}