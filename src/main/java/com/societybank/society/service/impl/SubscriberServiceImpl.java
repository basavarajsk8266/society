package com.societybank.society.service.impl;

import com.societybank.society.dto.SubscriberDto;
import com.societybank.society.entity.SubscriberEntity;
import com.societybank.society.repository.SubscriberRepository;
import com.societybank.society.service.SubscriberService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    SubscriberRepository subscriberRepository;

    @Autowired
    public SubscriberServiceImpl(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }


    @Override
    public SubscriberDto save(SubscriberDto subscriberDto) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        SubscriberEntity subscriberEntity = modelMapper.map(subscriberDto, SubscriberEntity.class);
        subscriberRepository.save(subscriberEntity);
        SubscriberDto returnData = modelMapper.map(subscriberEntity, SubscriberDto.class);
        return returnData;
    }

    @Override
    public List<SubscriberDto> findAll() {
        List<SubscriberEntity> subscribers = subscriberRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<SubscriberDto> subscriberList = Arrays.asList(modelMapper.map(subscribers, SubscriberDto[].class));
        return subscriberList;
    }

    @Override
    public Optional<SubscriberEntity> findById(Integer id) {
        return subscriberRepository.findById(id);
    }

    @Override
    public SubscriberDto update(SubscriberDto subscribers) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        SubscriberEntity subscriberEntity = modelMapper.map(subscribers, SubscriberEntity.class);
        subscriberRepository.save(subscriberEntity);
        SubscriberDto returnData = modelMapper.map(subscriberEntity, SubscriberDto.class);
        return null;
    }

    @Override
    public void deleteSubscriber(Integer id) {
        subscriberRepository.deleteById(id);
    }
}

