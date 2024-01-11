package com.reactive.prog.repo;

import com.reactive.prog.model.Student;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface StudentRepo extends R2dbcRepository<Student,String> {
}
