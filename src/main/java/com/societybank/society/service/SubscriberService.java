package com.societybank.society.service;

import com.societybank.society.dto.SubscriberDto;

import java.util.List;

public interface SubscriberService {
    SubscriberDto save(SubscriberDto subscriberDto);
    List<SubscriberDto> findAll();
}
