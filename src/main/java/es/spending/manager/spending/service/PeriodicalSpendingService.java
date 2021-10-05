package es.spending.manager.spending.service;

import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;

import java.util.List;

public interface PeriodicalSpendingService {

    List<SpendingBean> findAll();

    List<SpendingBean> saveSpending(List<PeriodicalSpendingBean> spendingBean);
}
