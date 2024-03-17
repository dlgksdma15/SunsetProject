package com.suntime.study.repository;

import com.suntime.study.entity.PersonalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// 엔티티 타입하고 pk
public interface PersonalRepository extends JpaRepository<PersonalEntity, Long> {
}