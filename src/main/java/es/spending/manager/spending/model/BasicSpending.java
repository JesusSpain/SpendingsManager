package es.spending.manager.spending.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "SPENDING", name = "BASIC_SPENDING")
public class BasicSpending extends Spending {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SPENDING.SEQ_BASIC_SPENDING")
    private Integer id;

    @Column
    private Date payDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
