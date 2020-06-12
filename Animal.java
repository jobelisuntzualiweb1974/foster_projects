/**
 * Implements Animal class
 */
public class Animal {

    public String kind;
    public String integument;

    private Animal() {
    }

    /**
     * Construct a new Animal with a specified integument
     * @param integument the integument
     */
    protected Animal(String integument) {
        this.integument = integument;
    }

    /**
     * Specify the movement if moving fast or not
     * @param fast true if moving fast, false otherwise
     * @return the movement
     */
    public String movement(boolean fast) {
        if (fast) {
            return "I run on four legs.";
        } else {
            return "I walk on four legs.";
        }


    }

    /**
     * Specify the sound.
     * @return the sound
     */
    public String sound() {
        return "";
    }

    /**
     * Factory method. Construct a new instance of animal based on specified kind.
     * @param kind the kind of Animal
     * @return  the animal object
     */
    static Animal newInstance(String kind) {
        switch (kind) {
            case "duck":
                return new Duck();
            case "dove":
                return new Dove();
            case "lion":
                return new Lion();
                case "rabbit":
                return new Rabbit();
            default:
                return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) {
            return false;
        }
        Animal objAnimal = (Animal) obj;
        if (integument.equals(objAnimal.integument)
                && kind.equals(objAnimal.kind)
                && sound().equals(objAnimal.sound())
                && movement(true).equals(objAnimal.movement(true))
                && movement(false).equals(objAnimal.movement(false))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * print the animal details
     */
    public void print() {
        System.out.println("I am a " + kind + ".");
        System.out.println("I have " + integument + ".");
        System.out.println("When I go slowly, " + movement(false) + ".");
        System.out.println("When I go fast, " + movement(true) + ".");
        System.out.println("The sound I make is " + sound() + ".");
    }
}
