package Restaurant.bootstrap;

import Restaurant.model.Client;
import Restaurant.model.Table;
import Restaurant.service.ClientService;
import Restaurant.service.OrderService;
import Restaurant.service.TableService;
import Restaurant.service.map.ClientServiceMap;
import Restaurant.service.map.OrderServiceMap;
import Restaurant.service.map.TableServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final ClientService clientService;
    private final TableService tableService;

    public DataLoader(ClientService clientService, TableService tableService) {
        this.clientService = clientService;
        this.tableService = tableService;
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client();
        client1.setFirstName("Jan");
        client1.setLastName("Kowalski");
        client1.setAddress("Korzuchowa 15");
        client1.setCity("Wygwizdowo");
        client1.setTelephone("1234567890");
        clientService.save(client1);

        Client client2 = new Client();
        client2.setFirstName("Anna");
        client2.setLastName("Górska");
        client2.setAddress("Korzuchowa 15");
        client2.setCity("Wygwizdowo");
        client2.setTelephone("1098765432");
        clientService.save(client2);

        System.out.println(" ");

        Table table1 = new Table();
        table1.setNumber("1");
        table1.setOutside(false);
        table1.setSize("2 people");
        tableService.save(table1);

        Table table2 = new Table();
        table2.setNumber("2");
        table2.setOutside(false);
        table2.setSize("4 people");
        tableService.save(table2);

        System.out.println(" ");

    }
}
