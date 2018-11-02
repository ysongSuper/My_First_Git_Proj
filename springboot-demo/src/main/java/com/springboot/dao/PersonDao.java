package com.springboot.dao;

import com.springboot.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangsong on 2018/10/29.
 */
@Repository
public interface PersonDao extends JpaRepository<Person,Long> {

    @RestResource(path = "nameStartsWith",rel = "nameStartsWith")
    List<Person> findByNameStartsWith(@Param("name") String name);

}
