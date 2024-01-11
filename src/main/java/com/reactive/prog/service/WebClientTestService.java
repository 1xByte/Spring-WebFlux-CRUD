package com.reactive.prog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class WebClientTestService {


    public Mono<String> getData(Integer id){

        WebClient webClient = WebClient.builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    log.info("Inside Service method");

    return webClient.get()
                .uri("/posts/{id}", id)
                .retrieve()
                .bodyToMono(String.class);

    }


}
