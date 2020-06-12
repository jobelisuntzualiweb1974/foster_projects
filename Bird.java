
public class Bird extends Animal {

    
    Bird() {
        super("feathers");
    }

    @Override
    public String movement(boolean fast) {
        if (fast) {
            return "I fly.";
        } else {
            return "I walk on four legs.";
        }

    }
}
