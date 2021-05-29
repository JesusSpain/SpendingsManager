package es.spending.manager.controller;

import es.spending.manager.exception.ResourceNotFoundException;
import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.model.BasicSpending;
import es.spending.manager.spending.model.PeriodicalSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import es.spending.manager.spending.service.PeriodicalSpendingService;
import es.spending.manager.utils.MessagesKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/spendings")
public class SpendingController {


    @Autowired
    private MessageSource messageSource;

    @Autowired
    private BasicSpendingService basicSpendingService;

    @Autowired
    private PeriodicalSpendingService periodicalSpendingService;

    @GetMapping(value = "/basic", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SpendingBean> getAllBasicSpendings(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale)
            throws ResourceNotFoundException {

        List<SpendingBean> spendings = basicSpendingService.findAll();
        if (CollectionUtils.isEmpty(spendings)) {
            throw new ResourceNotFoundException(
                    messageSource.getMessage(MessagesKeys.MSG_RESOURCE_NOT_FOUND, null, locale),
                    BasicSpending.class.getCanonicalName());
        }
        return spendings;
    }

    @GetMapping(value = "/periodical", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SpendingBean> getAllPeriodicalSpendings(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale)
            throws ResourceNotFoundException {

        List<SpendingBean> spendings = periodicalSpendingService.findAll();
        if (spendings == null) {
            throw new ResourceNotFoundException(
                    messageSource.getMessage(MessagesKeys.MSG_RESOURCE_NOT_FOUND, null, locale),
                    PeriodicalSpending.class.getCanonicalName());
        }
        return spendings;
    }
}
