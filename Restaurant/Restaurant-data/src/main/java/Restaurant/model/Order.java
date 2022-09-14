package Restaurant.model;

public class Order extends BaseEntity{

    private Table nrTable;
    private Client client;
    private String order;

    public Table getNrTable() {
        return nrTable;
    }

    public void setNrTable(Table nrTable) {
        this.nrTable = nrTable;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
