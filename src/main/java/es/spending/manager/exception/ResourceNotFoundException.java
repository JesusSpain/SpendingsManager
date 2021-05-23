package es.spending.manager.exception;

import java.util.Date;

public class ResourceNotFoundException extends SpendingException {

    private String resourceType;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceType) {
        super();
        this.resourceType = resourceType;
    }

    public ResourceNotFoundException(String detailedApplicationMessage, String resourceType) {
        super(new Date(), detailedApplicationMessage);
        this.resourceType = resourceType;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
