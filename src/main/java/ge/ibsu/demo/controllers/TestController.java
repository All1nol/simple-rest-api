package ge.ibsu.demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ge.ibsu.demo.dto.Person;
import ge.ibsu.demo.dto.Test;

@RestController
@RequestMapping(value = "api/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/call" , method = RequestMethod.GET, produces = {"application/json"} )

    public String test() {
        return "Hello";
    }

    @ResponseBody
    @RequestMapping(value = "/person", method = RequestMethod.POST , produces = {"application/json"})
    public Test test( @RequestBody Person rd){
        Test t= new Test();
        t.setFullname(rd.getFirstname()+ " " + rd.getLastname());
        return t;
    }
}
