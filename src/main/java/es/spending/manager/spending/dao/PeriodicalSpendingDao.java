package es.spending.manager.spending.dao;

import es.spending.manager.spending.model.PeriodicalSpending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicalSpendingDao extends JpaRepository<PeriodicalSpending, Integer> {
}
