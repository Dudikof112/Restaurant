package Restaurant.service;

import Restaurant.model.Table;

import java.util.Set;

public interface TableService {

    Table findById(Long id);
    Table save(Table table);
    Set<Table> fingAll();
}
