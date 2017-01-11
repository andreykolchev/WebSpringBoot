package com.repository;

import com.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Andrey on 20.02.2016.
 */
@Repository
@Transactional
public interface GreetingRepository extends CrudRepository<Greeting,Long> {
}
