package com.springapp.springdatajpapostgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "kisi")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = {"id"})//2 tane adress nesnesinin id'leri birbirne eşitse bunlar aynıdır
@ToString
public class Kisi {

    @Id
    @SequenceGenerator(name = "seq_kisi")
    @GeneratedValue(generator = "seq_kisi",strategy = GenerationType.SEQUENCE) //id will be taken from sequence
    private Long id;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "surname")
    private String surname;

    //join
    //bir kişi nesnesi, birden fazla adrese gidebilir-
    //bir kişiye istediğimiz kadar adres eklemek
    @OneToMany
    @JoinColumn(name = "kisi_adres_id")
    private List<Adres> addressList;




}
