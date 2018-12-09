package com.triple.firstappdemo.repository;

import com.triple.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link Repository}
 */
@Repository
public class UserRepository {

    /**
     * 保存用户对象
     * @param user
     * @return
     */

    private final ConcurrentMap<Integer,User> repository
            = new ConcurrentHashMap<>();
    private final static AtomicInteger idGenerator
            = new AtomicInteger();

    public boolean save(User user){
        // ID  从1 开始
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return repository.put(id,user) == null;
    }

    public Collection<User> findAll(){
        return repository.values();
    }
}
