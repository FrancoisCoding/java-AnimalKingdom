package animals;

public class Fish extends AbstractAnimal {
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return name + " starts swimming.";
    }

    @Override
    public String breathe() {
        return "Breathes using gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}

// Extra Notes
// Overide - It's a hint for the compiler to let it know that you're overriding the method of a parent class (or interface in Java 6).
// Super - The super keyword in java is a reference variable that is used to refer parent class objects.  The keyword "super" came into the picture with the concept of Inheritance. It is majorly used in the following contexts: