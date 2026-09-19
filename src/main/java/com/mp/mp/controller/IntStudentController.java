package com.mp.mp.controller;


import com.mp.mp.entity.IntStudent;
import com.mp.mp.service.IntStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:5173")
public class IntStudentController {

    @Autowired
    private IntStudentService intStudentService;

    @PostMapping("/create")
    ResponseEntity<String> createIntStudent(@RequestBody IntStudent intStudent){
        intStudentService.createIntStudent(intStudent);
        return ResponseEntity.status(HttpStatus.CREATED).body("International Student created successfully..");

    }

    @GetMapping("/{id}")
    ResponseEntity<IntStudent> getIntStudent(@PathVariable("id") Long id){
        IntStudent stu= intStudentService.getIntStudent(id);
        return ResponseEntity.status(HttpStatus.OK).body(stu);
    }

    @GetMapping("/")
    ResponseEntity<List<IntStudent>> getAllIntStudent(){
        List<IntStudent> students= intStudentService.getAllIntStudent();
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }
}
