package es.spending.manager.spending.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "SPENDING", name = "PERIODICAL_SPENDING")
public class PeriodicalSpending extends Spending {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERIODICAL_SPENDING")
    @SequenceGenerator(name = "SEQ_PERIODICAL_SPENDING",schema = "SPENDING",
            sequenceName = "SEQ_PERIODICAL_SPENDING", allocationSize = 1)
    private Integer id;

    @Column
    private Date startDate;

    @Column
    private Date payDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
