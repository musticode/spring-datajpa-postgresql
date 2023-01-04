package com.springapp.springdatajpapostgresql.repository;

import com.springapp.springdatajpapostgresql.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adres, Long> {
}
