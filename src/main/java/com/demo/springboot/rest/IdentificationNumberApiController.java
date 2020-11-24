package com.demo.springboot.rest;

import com.demo.springboot.classes.ValidatePesel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IdentificationNumberApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IdentificationNumberApiController.class);

    @CrossOrigin
    @GetMapping(value = "/check-identification-number")
    public ResponseEntity<Void> checkIdentificationNumber(@RequestParam(defaultValue = "") String id) {
        LOGGER.info("--- check identification number: {}", id);
        if(ValidatePesel.isValidate(id)){
            LOGGER.info("--- TRUE: {}", id);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        else{
            LOGGER.info("--- FALSEE: {}", id);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

}
