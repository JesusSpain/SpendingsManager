package es.spending.manager.spending.dao;

import es.spending.manager.spending.model.BasicSpending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicSpendingDao extends JpaRepository<BasicSpending, Integer> {

}
