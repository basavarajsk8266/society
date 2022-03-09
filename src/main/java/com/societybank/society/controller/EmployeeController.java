package com.societybank.society.controller;

import com.societybank.society.dto.EmployeeDto;
import com.societybank.society.dto.EmployeeResponseModel;
import com.societybank.society.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<EmployeeResponseModel> getEmployees(){
        EmployeeResponseModel employeeResponseModel= new EmployeeResponseModel();
        employeeResponseModel.setEmployees(employeeService.findAll());
        employeeResponseModel.setDataCount(employeeResponseModel.getEmployees().size());
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponseModel);
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeDto> createEmployees(@RequestBody EmployeeDto employeeDto){
        employeeDto = employeeService.save(employeeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeDto);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<EmployeeResponseModel> findEmployeeById(){
//        EmployeeResponseModel employeeResponseModel = new EmployeeResponseModel();
//        //employeeResponseModel.setEmployees(employeeService.findById(findEmployeeById()));
//        employeeResponseModel.setDataCount(employeeResponseModel.getEmployees().size());
//        return ResponseEntity.status(HttpStatus.OK).body(employeeResponseModel);
//
//    }

}
