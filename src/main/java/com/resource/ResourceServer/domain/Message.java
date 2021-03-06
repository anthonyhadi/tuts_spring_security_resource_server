package com.resource.ResourceServer.domain;

public class Message {

    String id;
    String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Message(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}