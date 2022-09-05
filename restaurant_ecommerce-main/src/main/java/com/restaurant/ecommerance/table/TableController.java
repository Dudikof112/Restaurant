package com.restaurant.ecommerance.table;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class TableController {

    private TableService tableService;

    @GetMapping
    public String getTable(){
        return tableService.getTable();

    }

}
