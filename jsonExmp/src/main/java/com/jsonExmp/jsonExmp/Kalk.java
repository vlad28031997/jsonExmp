package com.jsonExmp.jsonExmp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Kalk {

    @RequestMapping(value = "/kalk",method = RequestMethod.POST)
    public ResponseEntity pro(@RequestBody Resh resh1) {
        return new ResponseEntity(resh1.reshenie(), HttpStatus.OK);
    }


}

