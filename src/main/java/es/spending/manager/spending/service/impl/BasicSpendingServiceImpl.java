package es.spending.manager.spending.service.impl;

import es.spending.manager.spending.beans.BasicSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.dao.BasicSpendingDao;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import es.spending.manager.spending.utils.SpendingTransformer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicSpendingServiceImpl implements BasicSpendingService {

    @Autowired
    private BasicSpendingDao basicSpendingDao;

    @Override
    public List<SpendingBean> findAll() {
        List<BasicSpending> spendingsFound = basicSpendingDao.findAll();
        return SpendingTransformer.basicSpendingModelToBean(spendingsFound);
    }
}
