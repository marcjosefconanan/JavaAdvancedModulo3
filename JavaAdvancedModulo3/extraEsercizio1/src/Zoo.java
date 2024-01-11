import java.time.LocalDate;
import java.util.*;

public class Zoo {
    //nominiamo i Arraylist, hashMap e hashSet
    private ArrayList<Animal> animalList;
    private HashMap<Integer, Animal> animalMap;
    private HashSet<Animal> animalSet;

    //costrutto
    public Zoo() {
        this.animalList = new ArrayList<>();
        this.animalMap = new HashMap<>();
        this.animalSet = new HashSet<>();
    }

    // qui stiamo aggiungendo gli animali al'Arraylist
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }
    // Stampiamo le info dei animili che sono dentro l'Arraylist
    public void printDescription() {
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }

    // qui invece aggiungiamo gli animali nel HashMap con i ID.
    public void addAnimalToMap(Integer id, Animal animal) {
        animalMap.put(id, animal);
    }

    // qui stampiamo i animali gia dentro il HashMap con le proprie ID.
    public void printAnimalDetailsWithId() {
        for (Map.Entry<Integer, Animal> entry : animalMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName() +
                    ", Species: " + entry.getValue().getSpecies());
        }
    }

    // e qui aggiungiamo animali dentro il HashSet che controlla se la spece e presente
    public void addAnimalToHashSet(Animal animal) {
        boolean isSpeciesPresent = false;

        // qui vede se HashSet e vuoto e se lo è lo riespe con un animale.
        if (animalSet.isEmpty()) {
            animalSet.add(animal);
            // qui stampa questo messagio quando una nuova specie di animale e stato aggiunto
            System.out.println(animal + " : Animal added to HashSet");
        } else {
            // e se HashSet non e piu vuoto compara gli animali che sono dentro HashSet con quello in questione se ce gia una spece uguale dentro HashSet
            for (Animal currentAnimal : animalSet) {
                if (currentAnimal.getSpecies().equals(animal.getSpecies())) {
                    isSpeciesPresent = true;
                    break;
                }
            }
            if (!isSpeciesPresent) {
                animalSet.add(animal);
                //stampa questo
                System.out.println("Animal added to HashSet");
            } else {
                //o se no questo.
                System.out.println(animal + " : Species already present in HashSet");
            }
        }
    }

    // questo controlla se i compleanni dei animali sono sotto la data che abbiamo impostato.
    public void checkAnimalBirthdays(LocalDate date) {
        for (Animal animal : animalList) {
            if (animal.isBirthdayBelow(date)) {
                System.out.println(animal.getName() + "'s birthday is below " + date);
            }
        }
    }
}