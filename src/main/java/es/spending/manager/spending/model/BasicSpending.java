package es.spending.manager.spending.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema = "SPENDING", name = "BASIC_SPENDING")
public class BasicSpending extends Spending {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_BASIC_SPENDING")
    @SequenceGenerator(name = "SEQ_BASIC_SPENDING", schema = "SPENDING", sequenceName = "SEQ_BASIC_SPENDING", allocationSize = 1)
    private Integer id;

    @Column
    private Date payDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "BasicSpending { " +
                "id=" + id +
                ", payDate=" + payDate +
                ", name='" + getName() +
                ", amount=" + getAmount() +
                ", type=" + getType() +
                " }";
    }
}
