package com.projet.ah_fashion.controller;

import com.projet.ah_fashion.model.Client;
import com.projet.ah_fashion.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService ;

    @RequestMapping(method = RequestMethod.GET, value = "/clients")
    public List<Client> getClient(){
        return clientService.getClients();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/client/{cli_id}")
    public Client getClent(@PathVariable long cli_id)
    {
        return clientService.getClient(cli_id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/client/{cli_id}")
    public void deleteClient(@PathVariable long cli_id){
        clientService.deleteClient(cli_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/clients")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/client/{cli_id}")
    public void updateClient(@RequestBody Client client, @PathVariable long cli_id){
        clientService.updateClient(client,cli_id);
    }

}
