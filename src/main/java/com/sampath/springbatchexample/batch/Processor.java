package com.sampath.springbatchexample.batch;

import com.sampath.springbatchexample.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<User, User> {


    @Override
    public User process(User user) throws Exception {
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
