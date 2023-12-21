package com.dream11.entity;

public class Message {
    private String content;

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
