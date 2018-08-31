package com.jsonExmp.jsonExmp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Calculator {

    @RequestMapping(value = "/calculator",method = RequestMethod.POST)
    public ResponseEntity act(@RequestBody Source source1) {

        return new ResponseEntity(source1.decision(), HttpStatus.OK);
    }


}

