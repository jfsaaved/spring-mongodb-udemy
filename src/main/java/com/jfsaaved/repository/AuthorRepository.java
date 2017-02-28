package com.jfsaaved.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.jfsaaved.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, BigInteger>{

}
