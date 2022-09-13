package Restaurant.service.map;

import Restaurant.model.Order;
import Restaurant.service.CrudService;

import java.util.Set;

public class OrderServiceMap extends AbstractMapService<Order, Long> implements CrudService<Order, Long> {

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
        return super.save(object.getId(), object);
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
