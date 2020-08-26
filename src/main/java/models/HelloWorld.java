package models;

import interfaces.ISpringBean;

public class HelloWorld implements ISpringBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}