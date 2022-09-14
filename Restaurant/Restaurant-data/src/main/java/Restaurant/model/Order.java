package Restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@javax.persistence.Table
public class Order extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "type_id")
    private Table nrTable;
    @OneToOne
    @JoinColumn(name = "client")
    private Client client;
    @Column(name = "order")
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
