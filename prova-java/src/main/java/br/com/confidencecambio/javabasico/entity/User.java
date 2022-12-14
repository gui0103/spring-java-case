package br.com.confidencecambio.javabasico.entity;

import javax.validation.constraints.NotBlank;
import java.util.Locale;

public abstract class User {

    @NotBlank
    private String name;

    public User(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
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
            response = shortName + removeFirstThreeWords();
        }
        else {
            String shortName = String.format("%s %c.", names[0], letter);

            StringBuffer lastNames = new StringBuffer(getLastNames());
            int index = lastNames.indexOf(" ");

            return shortName + " " + lastNames.delete(0, index + 1);
        }
        return response;
    }

    public String removeFirstThreeWords() {
        String[] array = getName().split(" ");
        StringBuilder response = new StringBuilder(String.format(""));
            for (int i = 0; i < array.length; i++) {
                if (i > 2) {
                    response.append(" ").append(array[i].toString());
                }
            }
            return response.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        this.name = name.trim();
    }
}
