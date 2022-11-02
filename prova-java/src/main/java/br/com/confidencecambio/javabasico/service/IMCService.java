package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class IMCService {

    public Double getIMC(Double weight, Double height) {
        return weight/(height * height);
    }
}
