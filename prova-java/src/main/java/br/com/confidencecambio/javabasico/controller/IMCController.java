package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imc")
public class IMCController {

    @Autowired
    private IMCService imcService;

    @GetMapping
    public ResponseEntity<Double> getIMC(@RequestParam(value = "weight", required = true) Double weight,
                                         @RequestParam(value = "height", required = true) Double height) {
        return new ResponseEntity<Double>(imcService.getIMC(weight, height), HttpStatus.OK);
    }
}
