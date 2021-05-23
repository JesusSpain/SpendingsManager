package es.spending.manager.controller;

import es.spending.manager.exception.ResourceNotFoundException;
import es.spending.manager.exception.SpendingException;
import es.spending.manager.spending.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Controller
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<SpendingException> handleResourceNotFound(ResourceNotFoundException ex, WebRequest request) {

        ExceptionResponse response = new ExceptionResponse();
        response.setDate(ex.getDate());
        response.setMessage(ex.getMessage());
        response.setDetail("Resource searched: " + ex.getResourceType());

        return new ResponseEntity(ex, HttpStatus.NOT_FOUND);
    }
}
