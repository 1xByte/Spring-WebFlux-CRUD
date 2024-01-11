package com.reactive.prog.cont;

import com.reactive.prog.service.WebClientTestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WebClientTestCont {

    private WebClientTestService service;

    public WebClientTestCont(WebClientTestService service) {
        this.service = service;
    }

    @GetMapping("/pos/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<String> getData(@PathVariable Integer id) {

        return service.getData(id);

    }
}
