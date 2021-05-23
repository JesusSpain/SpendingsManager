package es.spending.manager.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class SpendingException extends RuntimeException {

    private Date date;
    private String detailedApplicationMessage;

    public SpendingException() {
        super();
    }

    public SpendingException(Date date, String detailedApplicationMessage) {
        super();
        this.date = date;
        this.detailedApplicationMessage = detailedApplicationMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetailedApplicationMessage() {
        return detailedApplicationMessage;
    }

    public void setDetailedApplicationMessage(String detailedApplicationMessage) {
        this.detailedApplicationMessage = detailedApplicationMessage;
    }
}
