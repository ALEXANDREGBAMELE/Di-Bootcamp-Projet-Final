package com.projet.ah_fashion.service;

import com.projet.ah_fashion.model.Client;
import com.projet.ah_fashion.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public List<Client> getClients(){
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(client ->
                {clients.add(client);}
                );
        return clients;
    }

    public Client getClient(long cli_id) {
        return clientRepository.findById(cli_id).orElse(null);
    }

    public void deleteClient(long cli_id) {
        clientRepository.deleteById(cli_id);
    }

    public void addClient(Client client) {
        clientRepository.save( client);
    }

    public void updateClient(Client client, long cli_id) {
        clientRepository.save( client);
    }
}
