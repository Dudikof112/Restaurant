package Restaurant.service.map;

import Restaurant.model.Table;
import Restaurant.service.CrudService;

import java.util.Set;

public class TableServiceMap extends AbstractMapService<Table, Long> implements CrudService<Table, Long> {

    @Override
    public Set<Table> findAll() {
        return super.findAll();
    }

    @Override
    public Table findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Table save(Table object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Table object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
