package com.reactive.prog.cont;

import com.reactive.prog.model.Student;
import com.reactive.prog.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentCont {

    @Autowired
    private StudentService service;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Student> save(@RequestBody  Student student) {
        return service.save(student);
    }


    @GetMapping("/get")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Long> getAllStudents(){
        return service.getAllStudents();
    }


}
