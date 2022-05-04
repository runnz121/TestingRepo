package com.example.demo.service;

import com.example.demo.controller.FeignController;
import com.example.demo.dto.Contributor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceFeign {

    private final FeignController feignController;


    public List<Contributor> getContributor(String owner, String repo) {
        //getContributor 안에 들어가는 인자값은 FEIGN CLIENT에서 동적으로 값을 변경 할 수 있다.
        List<Contributor> contributors = feignController.getContributor(owner, repo);
        for(Contributor contributor : contributors) {
            System.out.println(contributor);
        }
        return contributors;
    }
}
