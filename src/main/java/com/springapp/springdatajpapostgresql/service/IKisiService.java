package com.springapp.springdatajpapostgresql.service;

import com.springapp.springdatajpapostgresql.dto.KisiDto;
import com.springapp.springdatajpapostgresql.entity.Kisi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IKisiService {
    KisiDto save(KisiDto kisiDto);
    void delete();
    List<KisiDto> getAll();
    Page<Kisi> getAll(Pageable pageable);
}
