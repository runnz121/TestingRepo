package com.example.demo.controller;


import com.example.demo.dto.Contributor;
import com.example.demo.service.ServiceFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class controller {

    //https://vmpo.tistory.com/109
    private final ServiceFeign serviceFeign;

    //예시 주소
    //https://api.github.com/repos/OpenFeign/feign/contributors
    @GetMapping(value = "/v1/github/{owner}/{repo}")
    public List<Contributor> getContributor(@PathVariable String owner, @PathVariable String repo) {
        return serviceFeign.getContributor(owner, repo);
    }

}
