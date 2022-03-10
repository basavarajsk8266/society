package com.societybank.society.service;

import com.societybank.society.dto.SubscriberDto;
import com.societybank.society.entity.SubscriberEntity;

import java.util.List;
import java.util.Optional;

public interface SubscriberService {

    SubscriberDto save(SubscriberDto subscriberDto);

    List<SubscriberDto> findAll();

    Optional<SubscriberEntity> findById(Integer id);

    SubscriberDto update(SubscriberDto subscribers);

    void deleteSubscriber(Integer id);
}
