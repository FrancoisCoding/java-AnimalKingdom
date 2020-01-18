package animals;

// Import ArrayList and Comparator individually to conserve memory

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // List of Mammals with Name and Date
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigFoot = new Mammal("BigFoot", 2021);

        // List of Birds with Name and Date
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // List of Fish with Name and Date
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("CatFish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Creates new ArrayList that will store all animals created
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();

        // Individually add each animal to the newly created ArrayList
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigFoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        // *** Using Lambda Expressions ***
        // (☞ﾟヮﾟ)☞ List all animals in descending order by year named:
        System.out.println("\n*** Animals in descending order by year ***");
        // Sorts animalList by year
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        // Maps over animalList and displays animals in sorted order with years
        animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getYear()));

        // (☞ﾟヮﾟ)☞ List all the animals alphabetically
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animal alphabetically ***");
        // Sorts animalList by names alphabeticaly
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        // Maps over animalList and displays animals in sorted order
        animalList.forEach(animal -> System.out.println(animal.getName()));

        // (☞ﾟヮﾟ)☞ List all the animals order by how they move
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animals order by how they move ***");
        // Sorts animalList by movement
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        // Maps over animalList and displays animals in sorted order
        animalList.forEach(animal -> System.out.println(animal.getName() + ": " + animal.move()));

        // (☞ﾟヮﾟ)☞ List only those animals that breath with lungs
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animals that breath with lungs ***");
        animalList.forEach(animal -> {
            if (animal.breathe().equals("Breathes using lungs")) {
                System.out.println(animal.getName() + ": " + animal.breathe());
            }
        });

        // (☞ﾟヮﾟ)☞ List only those animals that breath with lungs and were named in 1758
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animals that breath with lungs and were named in 1758 ***");
        animalList.forEach(animal -> {
            if (animal.breathe().equals("Breathes using lungs") && animal.year == 1758) {
                System.out.println(animal.getName() + ": " + animal.breathe() + " " + animal.year);
            }
        });

        // (☞ﾟヮﾟ)☞ List only those animals that lay eggs and breath with lungs
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animals that that lay eggs and breath with lungs ***");
        animalList.forEach(animal -> {
            if (animal.reproduce().equals("Eggs") && animal.breathe().equals("Breathes using lungs")) {
                System.out.println(animal.getName() + ": " + animal.breathe() + ". "
                        + animal.reproduce());
            }
        });

        // (☞ﾟヮﾟ)☞ List alphabetically only those animals that were named in 1758
        // Line break
        System.out.println();
        System.out.println("\n*** Listing all animals alphabetically that were named in 1758 ***");
        // Sorts animalList by names alphabeticaly
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(animal -> {
            if (animal.year == 1758) {
                System.out.println(animal.getName() + ":" + animal.year);
                ;
            }
        });
    }
}

// Extra Notes
// The Java String compareToIgnoreCase() method compares two strings lexicographically and returns 0 if they are equal. As we know compareTo() method does the same thing, however there is a difference between these two methods. Unlike compareTo() method, the compareToIgnoreCase() method ignores the case (uppercase or lowercase) while comparing strings.