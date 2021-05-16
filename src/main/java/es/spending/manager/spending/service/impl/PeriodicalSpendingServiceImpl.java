package es.spending.manager.spending.service.impl;

import es.spending.manager.spending.dao.PeriodicalSpendingDao;
import es.spending.manager.spending.model.PeriodicalSpending;
import es.spending.manager.spending.service.PeriodicalSpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodicalSpendingServiceImpl implements PeriodicalSpendingService {

    @Autowired
    private PeriodicalSpendingDao periodicalSpendingDao;

    @Override
    public List<PeriodicalSpending> findAll() {
        return periodicalSpendingDao.findAll();
    }
}
