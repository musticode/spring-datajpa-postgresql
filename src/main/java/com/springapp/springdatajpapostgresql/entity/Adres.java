package com.springapp.springdatajpapostgresql.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "kisi_adres")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = {"id"})//2 tane adress nesnesinin id'leri birbirne eşitse bunlar aynıdır
@ToString
public class Adres implements Serializable {


    @Id
    @SequenceGenerator(name = "seq_kisi_adres")
    @GeneratedValue(generator = "seq_kisi_adres",strategy = GenerationType.SEQUENCE) //id will be taken from sequence
    private Long id;

    @Column(length = 500, name = "address")
    private String address;

    @Enumerated //enumeration is used
    private AddressType addressType;

    @Column(name = "is_active")
    private Boolean isActive;

    //join
    //bu adres bir kişiye atanmıştır
    @ManyToOne //fetch eager-> her select yapıldığında ilgili kişisi de gelsin
    @JoinColumn(name = "kisi_adres_id")
    private Kisi kisi;



    public enum AddressType {
        HOME_ADDRESS,
        WORK_ADDRESS,
        OTHER
    }
}
