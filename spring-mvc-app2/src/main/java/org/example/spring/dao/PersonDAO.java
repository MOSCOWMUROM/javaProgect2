package org.example.spring.dao;

import org.example.spring.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.example.spring.models.Person;

import java.util.List;
import java.util.Optional;

@Component
public class PersonDAO {
  //Здесь будут лежать специфические запросы к БД (с помощью SQL)
}
