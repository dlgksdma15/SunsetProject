package com.suntime.study.entity;

import com.suntime.study.dto.PersonalDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "subject_table")
public class PersonalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String subject;

    @Column
    private int time;

    public static PersonalEntity toPersonalEntity(PersonalDTO personalDTO){
        PersonalEntity personalEntity = new PersonalEntity();
        personalEntity.setSubject(personalDTO.getSubject());
        return personalEntity;
    }
}