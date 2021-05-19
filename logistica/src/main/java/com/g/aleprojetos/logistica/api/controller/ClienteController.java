package com.g.aleprojetos.logistica.api.controller;

import com.g.aleprojetos.logistica.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){

        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setEmail("joaodascouves@logistica.com");
        cliente1.setTelefone("34 9999-1111");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setEmail("mariadasilva@logistica.com");
        cliente2.setTelefone("11 9777-2222");

        return Arrays.asList(cliente1,cliente2);
    }
}
