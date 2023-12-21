package com.dream11.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topic {
    public List<Message> messages = new ArrayList<>();
    public Map<String, Integer> consumerOffsets = new HashMap<>();

    public void publish(Message message) {
        messages.add(message);
    }

    public Message consume(String consumerId) {
        //offset
        int offset = consumerOffsets.getOrDefault(consumerId, 0);
        if(offset < messages.size()) {
            Message consumerMessage = messages.get(offset);
            consumerOffsets.put(consumerId, offset+1);
            return consumerMessage;
        }else {
            return null;
        }
    }
}
