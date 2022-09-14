package Restaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@javax.persistence.Table
public class Table extends BaseEntity {

    @Column(name = "number")
    private String number;
    @Column(name = "size")
    private String size;
    @Column(name = "is_outside")
    private boolean isOutside;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isOutside() {
        return isOutside;
    }

    public void setOutside(boolean outside) {
        isOutside = outside;
    }
}
