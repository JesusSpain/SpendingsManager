package es.spending.manager.spending.mappers;

import es.spending.manager.spending.beans.BasicSpendingBean;
import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.model.PeriodicalSpending;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class ModelToBeanMapper {

    public static List<SpendingBean> basicSpendingModelToBean(List<BasicSpending> basicSpendings) {
        List<SpendingBean> spendings = new ArrayList<>();
        basicSpendings.forEach(spending -> {
            BasicSpendingBean spendingBean = new BasicSpendingBean();
            BeanUtils.copyProperties(spending, spendingBean);
            spendings.add(spendingBean);
        });
        return spendings;
    }

    public static List<BasicSpending> basicSpendingBeanToModel(List<BasicSpendingBean> basicSpendingsBean) {
        List<BasicSpending> spendings = new ArrayList<>();
        basicSpendingsBean.forEach(spending -> {
            BasicSpending spendingBean = new BasicSpending();
            BeanUtils.copyProperties(spending, spendingBean);
            spendings.add(spendingBean);
        });
        return spendings;
    }

    public static List<SpendingBean> periodicalSpendingModelToBean(List<PeriodicalSpending> periodicalSpendings) {
        List<SpendingBean> spendings = new ArrayList<>();
        periodicalSpendings.forEach(spending -> {
            PeriodicalSpendingBean spendingBean = new PeriodicalSpendingBean();
            BeanUtils.copyProperties(spending, spendingBean);
            spendings.add(spendingBean);
        });
        return spendings;
    }

    public static List<PeriodicalSpending> periodicalSpendingBeanToModel(List<PeriodicalSpendingBean> basicSpendingsBean) {
        List<PeriodicalSpending> spendings = new ArrayList<>();
        basicSpendingsBean.forEach(spending -> {
            PeriodicalSpending spendingBean = new PeriodicalSpending();
            BeanUtils.copyProperties(spending, spendingBean);
            spendings.add(spendingBean);
        });
        return spendings;
    }
}
