package com.sampath.springbatchexample.batch;

import com.sampath.springbatchexample.model.User;
import com.sampath.springbatchexample.repository.UserRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data saved in DB" + users);
        userRepo.saveAll(users);
    }
}
