package com.springboot.service;

import com.springboot.bean.Person;
import com.springboot.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yangsong on 2018/10/29.
 */
@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        //Person p = personDao.save(person);
        Person p = personDao.findOne(person.getId());
        if (person.getName().equals("sang")) {
            throw new IllegalArgumentException("sang 已存在，数据将回滚");
        }
        return p;
    }
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        //Person p = personDao.save(person);
        Person p = personDao.findOne(person.getId());
        if (person.getName().equals("sang")) {
            throw new IllegalArgumentException("sang已存在，但数据不会回滚");
        }
        return p;
    }




    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        Person p = personDao.save(person);
        System.out.println("为id、key为" + p.getId() + "数据做了缓存");
        return p;
    }


    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.println("删除了id、key为" + id + "的数据缓存");
        //personDao.delete(id);
    }

    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personDao.findOne(person.getId());
        System.out.println("为id、key为" + p.getId() + "数据做了缓存");
        return p;
    }


}
