package br.com.confidencecambio.javabasico.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public abstract class User {

    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    public User(String name) {
        this.name = name.trim();
    }

    public String getFirstName() {
        return this.name.split(" ")[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }
}
