package com.example.taxcalculatedemo.Controller;

import com.example.taxcalculatedemo.Service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tax")
public class TaxController {

    @Autowired
    private TaxService taxService;

    @GetMapping("/calculate")
    public ResponseEntity<Double> calculateTax(@RequestParam double income) {
        double tax = taxService.calculateTax(income);
        return new ResponseEntity<>(tax, HttpStatus.OK);
    }
}


