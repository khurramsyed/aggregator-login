package com.leanmentors.account.aggregator.usermanagement.repository;

import com.leanmentors.account.aggregator.usermangement.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long>{

    List<User> findAll();

    List<User> findByUserName(String userName);

    @Override
    User findOne(Long aLong);

    @Override
    Iterable<User> findAll(Iterable<Long> iterable);

    @Override
    void delete(Long aLong);

    @Override
    void delete(User user);

    User save(User user);
}
