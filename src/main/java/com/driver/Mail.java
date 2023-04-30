package com.driver;

public class Mail {

    private Date date;
    private String sender, message;
    public Mail(Date date, String sender, String message){
        this.date = date;
        this.sender = sender;
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}