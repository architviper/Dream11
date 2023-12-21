package com.dream11.entity;

public class Consumer {
    public String consumerId;
    public Topic topic;

    public Consumer(String consumerId, Topic topic, int offset) {
        this.consumerId = consumerId;
        this.topic = topic;
        this.offset = offset;
    }

    public int offset;

    public Consumer(String consumerId, Topic topic) {
        this.consumerId = consumerId;
        this.topic = topic;
    }

    public void subscribe(){
        topic.consume(consumerId);
    }
    public void setOffset(int offset){
        this.offset = offset;
    }

    public void consumeMessage(){
       Message message=  topic.consume(consumerId);
       if(message != null) {
           //message consumer by cusumerid
           System.out.println("Consumer "+ consumerId+ "consumed "+ message);
       }else {
           //no message found now
           System.out.println("Consumer "+ consumerId+ "no messages for consumption ");
       }
    }
}
