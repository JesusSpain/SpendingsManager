package es.spending.manager.controller;

import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.model.PeriodicalSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import es.spending.manager.spending.service.PeriodicalSpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpendingController {

    @Autowired
    private BasicSpendingService basicSpendingService;

    @Autowired
    private PeriodicalSpendingService periodicalSpendingService;

    @GetMapping(value = "/spendings/basic", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BasicSpending> getAllBasicSpendings() {
        return basicSpendingService.findAll();
    }

    @GetMapping(value = "/spendings/periodical", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PeriodicalSpending> getAllPeriodicalSpendings() {
        return periodicalSpendingService.findAll();
    }
}
