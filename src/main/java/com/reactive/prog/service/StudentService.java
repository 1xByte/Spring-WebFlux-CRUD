package com.reactive.prog.service;

import com.reactive.prog.model.Student;
import com.reactive.prog.repo.StudentRepo;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public Mono<Student> save(Student tutorial) {
        return repo.save(tutorial);
    }

    public Mono<Long> getAllStudents(){
      return repo.findAll()
              .count().log();

    }

    


}
