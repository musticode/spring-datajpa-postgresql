package com.springapp.springdatajpapostgresql.service;

import com.springapp.springdatajpapostgresql.dto.KisiDto;
import com.springapp.springdatajpapostgresql.entity.Adres;
import com.springapp.springdatajpapostgresql.entity.Kisi;
import com.springapp.springdatajpapostgresql.repository.AdressRepository;
import com.springapp.springdatajpapostgresql.repository.KisiRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor //final için constructur yaratılıyor
public class KisiService implements IKisiService {

    private final KisiRepository kisiRepository;
    private final AdressRepository adressRepository;

    @Override
    @Transactional  //tek seferde bir şey yapmak için kullanılıyor
    public KisiDto save(KisiDto kisiDto) {

        Assert.isNull(kisiDto.getName(), "İsim alanı zorunludur");


        Kisi kisi = new Kisi();
        kisi.setName(kisiDto.getName());
        kisi.setSurname(kisiDto.getSurname());
        final Kisi kisiDb = kisiRepository.save(kisi);
        List<Adres> liste = new ArrayList<>();


        kisiDto.getAddressList().forEach(item -> {
            Adres adres = new Adres();
            adres.setAddress(item.getAddress());
            adres.setAddressType(Adres.AddressType.OTHER);
            adres.setIsActive(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });
        adressRepository.saveAll(liste);
        kisiDto.setId(kisiDb.getId());
        return kisiDto;

    }

    @Override
    public void delete() {

    }

    @Override
    public List<KisiDto> getAll(){
        List<Kisi> kisiler = kisiRepository.findAll();
        List<KisiDto> kisiDtos = new ArrayList<>();




        kisiler.forEach(it -> {
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setName(it.getName());
            kisiDto.setSurname(it.getSurname());
//            kisiDto.setAddressList(it.getAddressList().stream()
//                    .map(Adres::getAddress).collect(Collectors.toList()));

            kisiDtos.add(kisiDto);
        });
        return kisiDtos;
    }

    @Override
    public Page<Kisi> getAll(Pageable pageable) {
        return null;
    }
}
