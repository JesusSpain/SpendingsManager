package es.spending.manager.spending.service.impl;

import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.dao.PeriodicalSpendingDao;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.model.PeriodicalSpending;
import es.spending.manager.spending.service.PeriodicalSpendingService;
import es.spending.manager.spending.utils.SpendingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodicalSpendingServiceImpl implements PeriodicalSpendingService {

    @Autowired
    private PeriodicalSpendingDao periodicalSpendingDao;

    @Override
    public List<SpendingBean> findAll() {
        List<PeriodicalSpending> spendingsFound = periodicalSpendingDao.findAll();
        return SpendingTransformer.periodicalSpendingModelToBean(spendingsFound);
    }
}
