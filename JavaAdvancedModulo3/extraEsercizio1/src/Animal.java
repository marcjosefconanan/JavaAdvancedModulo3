//1.Classe Animal:
//o	Crea una classe Animal che abbia attributi come name (nome) e species (specie).
//o	Implementa i metodi equals e hashCode per consentire un corretto confronto tra animali

import java.time.LocalDate;
import java.util.Objects;

public class Animal {
    private String name;
    private String species;
    private DietEnum diet;
    private LocalDate birthday;

    public Animal(String name, String species, DietEnum diet, LocalDate birthday) {
        this.name = name;
        this.species = species;
        this.diet = diet;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }

    public DietEnum getDiet() {
        return diet;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    //questo controlla se il compleanno di un certo animale e sotto quello che avevamo in mente.
    public boolean isBirthdayBelow(LocalDate date) {
        return birthday.isBefore(date);
    }

    @Override
    public boolean equals(Object o) {
        // questo controlla se l'oggetto in questione e uguale al oggetto paragonato.
        if (this == o) return true;

        //controlla se l'oggetto paragonato e un instanza animale.
        if (!(o instanceof Animal animal)) return false;
        //paragana i nomi e spece del oggetto in paragone e logetto in questione.
        // se i nomi e la spece sono uguali allora e true se no false.
        return Objects.equals(name, animal.name) && Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species);
    }

    @Override
    public String toString() {
        return "Animal{" + diet + "-" +
                "Name: " + name +
                ", Species: " + species +
                '}';
    }
}
