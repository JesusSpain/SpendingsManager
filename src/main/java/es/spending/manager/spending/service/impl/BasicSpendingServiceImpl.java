package es.spending.manager.spending.service.impl;

import es.spending.manager.spending.dao.BasicSpendingDao;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicSpendingServiceImpl implements BasicSpendingService {

    @Autowired
    private BasicSpendingDao basicSpendingDao;

    @Override
    public List<BasicSpending> findAll() {
        return basicSpendingDao.findAll();
    }
}
