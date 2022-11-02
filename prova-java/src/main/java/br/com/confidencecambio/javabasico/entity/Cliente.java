package br.com.confidencecambio.javabasico.entity;

import java.util.stream.Stream;

public class Cliente extends User{
    public Cliente(String name) {
        super(name);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastNames() {
        return super.getLastNames();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
