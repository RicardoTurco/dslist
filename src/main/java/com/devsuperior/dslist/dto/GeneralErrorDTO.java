package com.devsuperior.dslist.dto;

public class GeneralErrorDTO {

    private String message;

    public GeneralErrorDTO() {
    }

    public GeneralErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
