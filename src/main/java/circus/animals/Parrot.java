package circus.animals;

import circus.animals.Bird;

public class Parrot extends Bird {
    @Override
    public String speak() {
        // need to implement the method in Abstract parent class
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }
}
