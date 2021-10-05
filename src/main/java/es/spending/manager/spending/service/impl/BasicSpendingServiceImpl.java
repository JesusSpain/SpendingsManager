package es.spending.manager.spending.service.impl;

import es.spending.manager.spending.beans.BasicSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.dao.BasicSpendingDao;
import es.spending.manager.spending.mappers.ModelToBeanMapper;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicSpendingServiceImpl implements BasicSpendingService {

    @Autowired
    private BasicSpendingDao basicSpendingDao;

    @Override
    public List<SpendingBean> findAll() {
        Iterable<BasicSpending> spendingsFound = basicSpendingDao.findAll();
        List<BasicSpending> spendingsFoundList = new ArrayList<>();
        spendingsFound.forEach(spendingsFoundList::add);
        return ModelToBeanMapper.basicSpendingModelToBean(spendingsFoundList);
    }

    @Override
    public List<SpendingBean> saveSpending(List<BasicSpendingBean> spendingBean) {
        List<BasicSpending> spendings = ModelToBeanMapper.basicSpendingBeanToModel(spendingBean);
        System.out.println(spendings.get(0).toString());
        List<BasicSpending> spendingsSaved = Arrays.asList(basicSpendingDao.save(spendings.get(0)));

        return ModelToBeanMapper.basicSpendingModelToBean(spendingsSaved);
    }


}
