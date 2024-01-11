package com.reactive.prog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer id;

    private String studentName;

    private String age;

    private Long bookId;

}
