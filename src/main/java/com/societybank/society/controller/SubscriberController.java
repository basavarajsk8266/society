package com.societybank.society.controller;

import com.societybank.society.dto.SubscriberDto;
import com.societybank.society.dto.SubscriberResponseModel;
import com.societybank.society.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscriber")
public class SubscriberController {

    private SubscriberService subscriberService;

    @Autowired
    public SubscriberController(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @GetMapping
    public ResponseEntity<SubscriberResponseModel> getSubscribers(){
        SubscriberResponseModel subscriberResponseModel= new SubscriberResponseModel();
        subscriberResponseModel.setSubscribers(subscriberService.findAll());
        subscriberResponseModel.setDataCount(subscriberResponseModel.getSubscribers().size());
        return  ResponseEntity.status(HttpStatus.OK).body(subscriberResponseModel);
    }

    @PostMapping("/save")
    public ResponseEntity<SubscriberDto> createSubscribers(@RequestBody SubscriberDto subscriberDto){
        subscriberDto = subscriberService.save(subscriberDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriberDto);
    }
}
