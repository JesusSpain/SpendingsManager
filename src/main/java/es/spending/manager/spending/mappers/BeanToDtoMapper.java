package es.spending.manager.spending.mappers;

import es.spending.manager.spending.beans.BasicSpendingBean;
import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.dto.BasicSpending;
import es.spending.manager.spending.dto.PeriodicalSpending;
import es.spending.manager.spending.dto.Spending;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class BeanToDtoMapper {

    public static List<Spending> mapBasicSpending(List<SpendingBean> basicSpendings) {
        List<Spending> spendings = new ArrayList<>();
        basicSpendings.stream().forEach(basicSpending -> {
            Spending spending = new BasicSpending();
            BeanUtils.copyProperties(basicSpending, spending);
            spendings.add(spending);
        });
        return spendings;
    }

    public static List<Spending> mapPeriodicalSpending(List<SpendingBean> periodicalSpendingBean) {
        List<Spending> spendings = new ArrayList<>();
        periodicalSpendingBean.stream().forEach(periodicalSpending -> {
            Spending spending = new PeriodicalSpending();
            BeanUtils.copyProperties(periodicalSpending, spending);
            spendings.add(spending);
        });
        return spendings;
    }

    public static List<BasicSpendingBean> mapBasicSpendingToBean(List<Spending> basicSpendings) {
        List<BasicSpendingBean> spendings = new ArrayList<>();
        basicSpendings.stream().forEach(basicSpending -> {
            BasicSpendingBean spending = new BasicSpendingBean();
            BeanUtils.copyProperties(basicSpending, spending);
            spendings.add(spending);
        });
        return spendings;
    }

    public static List<PeriodicalSpendingBean> mapPeriodicalSpendingToBean(List<Spending> periodicalSpendingBean) {
        List<PeriodicalSpendingBean> spendings = new ArrayList<>();
        periodicalSpendingBean.stream().forEach(periodicalSpending -> {
            PeriodicalSpendingBean spending = new PeriodicalSpendingBean();
            BeanUtils.copyProperties(periodicalSpending, spending);
            spendings.add(spending);
        });
        return spendings;
    }

    private BeanToDtoMapper() {}
}
