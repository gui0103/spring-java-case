package br.com.confidencecambio.javabasico.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.stream.Stream;

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

    public String getLastNames() {
        StringBuffer fullName = new StringBuffer(this.name);
        int index = fullName.indexOf(" ");
        fullName.delete(0, index + 1);

        return fullName.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }
}
