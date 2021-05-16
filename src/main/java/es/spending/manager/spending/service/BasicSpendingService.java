package es.spending.manager.spending.service;

import es.spending.manager.spending.model.BasicSpending;

import java.util.List;

public interface BasicSpendingService {

    List<BasicSpending> findAll();
}
