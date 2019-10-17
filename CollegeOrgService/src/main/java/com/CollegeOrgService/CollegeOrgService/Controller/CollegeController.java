package com.CollegeOrgService.CollegeOrgService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orgservice")
public class CollegeController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{studentId}")
    public  String getCatalog(@PathVariable("studentId") String studentId)
    {
        return restTemplate.getForObject("http://studentservice/api/{hello}",String.class,studentId);
       // return  "hello";
    }
}
