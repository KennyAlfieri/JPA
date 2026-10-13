package br.fiap.assistenciatecnica.web.dto;

public record ClienteResponse(
        String nome,
        String email,
        String telefone,
        String senha) {
}
