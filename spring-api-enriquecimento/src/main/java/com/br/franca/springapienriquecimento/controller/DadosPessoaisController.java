package com.br.franca.springapienriquecimento.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enriquecimento")
public class DadosPessoaisController {

    @GetMapping("dados-pessoais/{cpf}")
    public String buscarDadosPessoais(@PathVariable("cpf") String cpf) {

        return "Dados Pessoais aqui do cpf: " + cpf;

    }

}
