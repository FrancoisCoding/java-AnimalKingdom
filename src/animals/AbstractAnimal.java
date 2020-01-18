package animals;

public abstract class AbstractAnimal {
    // Randomizer adds number increase by 1 each time to uniqueId
    public static int randomizer = 0;

    // Fields needed
    int uniqueId;
    String name;
    int year;

    public AbstractAnimal(String name, int year) {
        this.name = name;
        this.year = year;
        uniqueId = randomizer++;
    }

    // Methods for the animals
    public abstract String move();

    public abstract String breathe();

    public abstract String reproduce();

    public String eat() {
        return "crunch";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getUniqueId() {
        return uniqueId;
    }


}