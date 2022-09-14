package Restaurant.service.map;

import Restaurant.model.Client;
import Restaurant.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ClientServiceMap extends AbstractMapService<Client, Long> implements ClientService {

    @Override
    public Set<Client> findAll() {
        return super.findAll();
    }

    @Override
    public Client findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Client save(Client object) {

        if(object != null){
            return super.save(object);
        }else{
            return null;
        }
    }

    @Override
    public void delete(Client object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Client findByLastName(String lastName) {
        return null;
    }
}
