package Restaurant.service.map;

import Restaurant.model.Order;
import Restaurant.service.CrudService;
import Restaurant.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OrderServiceMap extends AbstractMapService<Order, Long> implements OrderService {

    @Override
    public Set<Order> findAll() {
        return super.findAll();
    }

    @Override
    public Order findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Order save(Order object) {
        return super.save(object);
    }

    @Override
    public void delete(Order object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
