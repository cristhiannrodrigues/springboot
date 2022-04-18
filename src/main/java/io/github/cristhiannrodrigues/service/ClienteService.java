package io.github.cristhiannrodrigues.service;

import io.github.cristhiannrodrigues.model.Cliente;
import io.github.cristhiannrodrigues.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        clienteRepository.persistir(cliente);
    }

    public void validarCliente(Cliente nome) {

    }

}
