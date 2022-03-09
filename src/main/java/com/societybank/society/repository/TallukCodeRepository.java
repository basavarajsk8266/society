package com.societybank.society.repository;

import com.societybank.society.entity.TallukCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TallukCodeRepository extends JpaRepository<TallukCodeEntity, Integer> {
}