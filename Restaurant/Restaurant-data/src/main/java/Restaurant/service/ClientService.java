package Restaurant.service;

import Restaurant.model.Client;

import java.util.Set;

public interface ClientService {

    Client findByLastName(String lastName);
    Client findById(long id);
    Client save(Client client);
    Set<Client> findAll();
}
