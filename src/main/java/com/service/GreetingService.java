package com.service;

import com.model.Greeting;
import com.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by user on 04.01.17.
 */
@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public Greeting getById(Long id){
      return greetingRepository.findOne(id);
    }

}
