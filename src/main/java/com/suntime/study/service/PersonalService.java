package com.suntime.study.service;

import com.suntime.study.dto.PersonalDTO;
import com.suntime.study.entity.PersonalEntity;
import com.suntime.study.repository.PersonalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalService {
    private final PersonalRepository personalRepository;

    public void save(PersonalDTO personalDTO){
        PersonalEntity personalEntity = PersonalEntity.toPersonalEntity(personalDTO);
        personalRepository.save(personalEntity);
    }

    public List<PersonalEntity> getAllExampleEntities() {
        return personalRepository.findAll();
    }
}