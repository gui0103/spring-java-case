package br.com.confidencecambio.javabasico.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
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

    public String getUpperCasedName() {
        return getName().toUpperCase(Locale.ROOT);
    }

    public String getShortName() {
        String[] names = this.name.split(" ");
        char letter = names[1].charAt(0);
        String response = "";

        // Validação para casos específicos como o meu nome:
        // "Guilherme de Carvalho Costa"
        // A abreviação correta seria "Guilherme C. Costa", ignorando o "de"
        if (Character.isLowerCase(letter)) {
            char letterUpperCase = names[2].charAt(0);
            String shortName = String.format("%s %s %c.", names[0], names[1], letterUpperCase);

            // de Carvalho Costa
            response = shortName + removeWords();
        }
        else {
            String shortName = String.format("%s %c.", names[0], letter);

            StringBuffer lastNames = new StringBuffer(getLastNames());
            int index = lastNames.indexOf(" ");

            return shortName + " " + lastNames.delete(0, index + 1);
        }
        return response;
    }

    public String removeWords() {
        String[] array = getLastNames().split(" ");
        StringBuilder response = new StringBuilder(String.format(""));
            for (int i = 0; i < array.length; i++) {
                if (i > 1) {
                    response.append(" ").append(array[i].toString());
                }
            }
            return response.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }
}
