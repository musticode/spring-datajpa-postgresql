package com.springapp.springdatajpapostgresql.dto;

import com.springapp.springdatajpapostgresql.entity.Adres;
import lombok.Data;

import java.util.List;

@Data
public class KisiDto {

    private Long id;

    private String name;

    private String surname;

    private List<Adres> addressList;

}
