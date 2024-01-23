package com.dbp.controller.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    @CrossOrigin
    public ResponseEntity<?> home(){
        return new ResponseEntity<>("hi22", HttpStatus.OK);
    }
    //이거 왜이러지
}
