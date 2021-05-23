package es.spending.manager.spending.dto;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    private Date date;
    private String message;
    private String detail;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
