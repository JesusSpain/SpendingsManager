package es.spending.manager.spending.model;

public enum SpendingType {
    BUY(1),
    SERVICE_SUSCRIPTION(2),
    DIRECT_DEBIT(3);

    SpendingType(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
