package Restaurant.controller;

import Restaurant.service.TableService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {

    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @RequestMapping({"/tables","/tables/index","/tables/index.html"})
    public String listTables(Model model){
        model.addAttribute("tables", tableService.findAll());
        return "table/index";
    }
}
