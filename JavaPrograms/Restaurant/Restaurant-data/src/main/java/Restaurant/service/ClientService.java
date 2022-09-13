package Restaurant.service;

import Restaurant.model.Client;


public interface ClientService extends CrudService<Client, Long> {

    Client findByLastName(String lastName);
}
