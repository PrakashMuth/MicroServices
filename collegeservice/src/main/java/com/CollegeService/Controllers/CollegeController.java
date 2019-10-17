package com.CollegeService.Controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{collegeId}")
    @HystrixCommand(fallbackMethod = "getFallBack",
            threadPoolKey = "collegepoolkey",
            threadPoolProperties = {
                    @HystrixProperty(name = "coreSize", value = "20"),
                    @HystrixProperty(name = "maxQueueSize", value = "10")
            })
    /* commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "5"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "50"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "5000")
    } */
    public String getcollegeInfo(@PathVariable String collegeId) {
        return restTemplate.getForObject("http://college-org-service/orgservice/{studentId}", String.class, collegeId);
    }

    public String getFallBack(@PathVariable String collegeId) {
        return "fallback occured " + collegeId;
    }
}
