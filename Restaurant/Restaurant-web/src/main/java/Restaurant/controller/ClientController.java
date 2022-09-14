package Restaurant.controller;

import Restaurant.model.Client;
import Restaurant.service.ClientService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping({"/clients", "/clients/index","/clients/index.html"})
    public String listOfClients(Model model){

        model.addAttribute("clients",clientService.findAll());
        return "clients/index";
    }
}
