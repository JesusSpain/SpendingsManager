package es.spending.manager.controller;

import es.spending.manager.exception.ResourceNotFoundException;
import es.spending.manager.spending.beans.BasicSpendingBean;
import es.spending.manager.spending.beans.PeriodicalSpendingBean;
import es.spending.manager.spending.beans.SpendingBean;
import es.spending.manager.spending.dto.Spending;
import es.spending.manager.spending.mappers.BeanToDtoMapper;
import es.spending.manager.spending.dto.BasicSpending;
import es.spending.manager.spending.dto.PeriodicalSpending;
import es.spending.manager.spending.service.BasicSpendingService;
import es.spending.manager.spending.service.PeriodicalSpendingService;
import es.spending.manager.utils.MessagesKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
    public List<Spending> getAllBasicSpendings(
            @RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, required = false) Locale locale)
            throws ResourceNotFoundException {

        List<SpendingBean> spendings = basicSpendingService.findAll();
        if (CollectionUtils.isEmpty(spendings)) {
            throw new ResourceNotFoundException(
                    messageSource.getMessage(MessagesKeys.MSG_RESOURCE_NOT_FOUND, null, locale),
                    BasicSpending.class.getCanonicalName());
        }
        return BeanToDtoMapper.mapBasicSpending(spendings);
    }

    @GetMapping(value = "/periodical", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Spending> getAllPeriodicalSpendings(
            @RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, required = false) Locale locale)
            throws ResourceNotFoundException {

        List<SpendingBean> spendings = periodicalSpendingService.findAll();
        if (spendings == null) {
            throw new ResourceNotFoundException(
                    messageSource.getMessage(MessagesKeys.MSG_RESOURCE_NOT_FOUND, null, locale),
                    PeriodicalSpending.class.getCanonicalName());
        }
        return BeanToDtoMapper.mapPeriodicalSpending(spendings);
    }

    @PostMapping(value = "/basic",produces = MediaType.APPLICATION_JSON_VALUE)
    public Spending saveNewBasicSpending(@RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, required = false) Locale locale,
                                              @RequestBody BasicSpending newSpending) {
        List<BasicSpendingBean> newSpendingBean = BeanToDtoMapper.mapBasicSpendingToBean(Arrays.asList(newSpending));
        List<SpendingBean> spendingsBeanSaved = basicSpendingService.saveSpending(newSpendingBean);
        //TODO: FALTARIA ESCRIBIR EL CODIGO HTTP DE RECURSO CREADO (?)
        return BeanToDtoMapper.mapBasicSpending(spendingsBeanSaved).get(0);
    }

    @PostMapping(value = "/periodical", produces = MediaType.APPLICATION_JSON_VALUE)
    public Spending saveNewPeriodicalSpending(@RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, required = false) Locale locale,
                                    @RequestBody PeriodicalSpending newSpending) {
        List<PeriodicalSpendingBean> newSpendingBean = BeanToDtoMapper.mapPeriodicalSpendingToBean(Arrays.asList(newSpending));
        List<SpendingBean> spendingsBeanSaved = periodicalSpendingService.saveSpending(newSpendingBean);
        //TODO: FALTARIA ESCRIBIR EL CODIGO HTTP DE RECURSO CREADO (?)
        return BeanToDtoMapper.mapPeriodicalSpending(spendingsBeanSaved).get(0);
    }


}
