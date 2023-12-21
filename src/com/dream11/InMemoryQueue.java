package com.dream11;

import com.dream11.entity.Consumer;
import com.dream11.entity.Message;
import com.dream11.entity.Topic;

public class InMemoryQueue {

    public static void main(String[] args) {
	// write your code here//
        //topic
        Topic mytopic = new Topic();

        Consumer consumer1 = new Consumer("consumer1", mytopic);
        Consumer consumer2 = new Consumer("consumer2", mytopic);

        consumer1.subscribe();
        consumer2.subscribe();

        mytopic.publish(new Message("Hello, i am archit"));
        mytopic.publish(new Message("Hello, i am test1"));
        mytopic.publish(new Message("Hello, i am test2"));
        mytopic.publish(new Message("Hello, i am test3"));

        consumer1.setOffset(1);
        consumer2.setOffset(0);

        consumer1.consumeMessage();
        consumer2.consumeMessage();

        consumer1.consumeMessage();
        consumer2.consumeMessage();

        consumer1.consumeMessage();
        consumer2.consumeMessage();

        consumer1.consumeMessage();
        consumer2.consumeMessage();

        consumer1.consumeMessage();
        consumer2.consumeMessage();

        consumer1.consumeMessage();
        consumer2.consumeMessage();

    }
}
