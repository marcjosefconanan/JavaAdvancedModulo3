//Immagina di dover gestire un parco zoologico virtuale che ospita diversi tipi di animali. Implementa un sistema di gestione degli animali utilizzando le Java Collections:
//1.	Classe Animal:
//o	Crea una classe Animal che abbia attributi come name (nome) e species (specie).
//o	Implementa i metodi equals e hashCode per consentire un corretto confronto tra animali
//2.	List (Collections):
//o	Utilizza una ArrayList per contenere una lista di animali all'interno del parco zoologico.
//o	Aggiungi diversi animali alla lista.
//o	Dimostra l'iterazione attraverso la lista e stampa i dettagli di ciascun animale.
//3.	Map (Collections):
//o	Utilizza una HashMap per mappare un identificativo univoco a ciascun animale nel parco zoologico.
//o	Aggiungi animali alla mappa utilizzando un identificativo numerico come chiave.
//o	Recupera gli animali dalla mappa utilizzando l'identificativo e stampa i dettagli di ciascun animale.
//4.	HashSet:
//o	Utilizza un HashSet per mantenere un insieme univoco di tipi di specie di animali nel parco zoologico.
//o	Aggiungi diverse specie di animali al HashSet e verifica se una nuova specie esiste già all'interno dell'insieme prima di aggiungerla.
//5.	Utilizza le eccezioni per gestire le casistiche in cui gli elementi non sono presenti ecc.
//Note aggiuntive:
//•	Evidenzia l'importanza dell'implementazione corretta di equals, hashCode, e instanceOf per garantire il corretto funzionamento delle strutture dati.
//•	Encoraggia la manipolazione e la visualizzazione dei dati nelle diverse strutture dati per familiarizzare con l'accesso e la gestione degli oggetti.

import java.time.LocalDate;

// Main Class
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Mufasa", "Lion", DietEnum.CARNIVORE, LocalDate.of(2019, 7, 19));
        Animal dog = new Animal("Courage", "Dog", DietEnum.OMNIVORE, LocalDate.of(1999, 11, 12));
        Animal zebra = new Animal("Marty", "Zebra", DietEnum.HERBIVORE, LocalDate.of(2015, 5, 15));
        Animal squid = new Animal("Squidward", "Squid", DietEnum.CARNIVORE, LocalDate.of(2013, 2, 1));
        Animal starfish = new Animal("Patrick", "Starfish", DietEnum.CARNIVORE, LocalDate.of(2000, 6, 23));
        Animal crab = new Animal("Mr. Crabs", "Crab", DietEnum.OMNIVORE, LocalDate.of(2020, 12, 19));

        Zoo zoo = new Zoo();
        //creamao una nuova istante per lo zoo

        zoo.addAnimal(lion);
        zoo.addAnimal(dog);
        zoo.addAnimal(zebra);
        zoo.addAnimal(squid);
        zoo.addAnimal(starfish);
        zoo.addAnimal(crab);


        zoo.printDescription();
        // stampa la lsta di animali per l'Arraylist

        zoo.addAnimalToMap(123, lion);

        zoo.printAnimalDetailsWithId();

        // Add a new animal to the zoo's HashSet and check for species presence

        zoo.addAnimalToHashSet(new Animal("Simba", "Lion", DietEnum.CARNIVORE, LocalDate.of(2010, 5, 15)));

        zoo.addAnimalToHashSet(new Animal("Nala", "Lion", DietEnum.CARNIVORE, LocalDate.of(2010, 5, 15)));

        LocalDate checkDate = LocalDate.of(2017, 1, 5);
        zoo.checkAnimalBirthdays(checkDate);

    }
}