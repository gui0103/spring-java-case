package br.com.confidencecambio.javabasico.entity;

public class Gerente extends User{
    public Gerente(String name) {
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
    public String getUpperCasedName() {
        return super.getUpperCasedName();
    }

    @Override
    public String getShortName() {
        return super.getShortName();
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