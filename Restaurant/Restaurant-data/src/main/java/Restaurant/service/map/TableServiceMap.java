package Restaurant.service.map;

import Restaurant.model.Table;
import Restaurant.service.TableService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class TableServiceMap extends AbstractMapService<Table, Long> implements TableService {

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
        return super.save(object);
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
