package com.everymind.desafio.nunes_sports.repository;

import org.springframework.data.repository.CrudRepository;

import com.everymind.desafio.nunes_sports.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
