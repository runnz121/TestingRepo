package com.example.demo.controller;


import com.example.demo.dto.Contributor;
import com.example.demo.global.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "feign", url = "https://api.github.com/repos", configuration = FeignConfig.class)
public interface FeignController {

    //service 단에서 호출하는 FEIGNCLIENT으로 SERvice 에서 들어오는 인자값을 동적으로 변경 시켜
    //파라미터로 전달 할  수 있다.
    @RequestMapping(method = RequestMethod.GET, value = "/{owner}/{repo}/contributors")
    List<Contributor> getContributor(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
