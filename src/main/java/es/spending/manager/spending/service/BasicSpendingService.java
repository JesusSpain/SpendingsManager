package es.spending.manager.spending.service;

import es.spending.manager.spending.beans.SpendingBean;

import java.util.List;

public interface BasicSpendingService {

    List<SpendingBean> findAll();
}
