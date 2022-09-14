package Restaurant.service;

import Restaurant.model.Client;
import org.springframework.stereotype.Service;


public interface ClientService extends CrudService<Client, Long> {

    Client findByLastName(String lastName);
}
