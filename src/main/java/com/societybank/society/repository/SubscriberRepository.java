package com.societybank.society.repository;

import com.societybank.society.entity.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<SubscriberEntity, Integer> {
}