package es.spending.manager.spending.service;

import es.spending.manager.spending.model.PeriodicalSpending;

import java.util.List;

public interface PeriodicalSpendingService {

    List<PeriodicalSpending> findAll();
}
