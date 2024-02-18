import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private List<Goable> runners;
    private List<Flyable> flyers;
    private List<Swimable> swimmers;

    public VetClinic() {
        this.runners = new ArrayList<>();
        this.flyers = new ArrayList<>();
        this.swimmers = new ArrayList<>();
    }

    public List<Goable> getAllRunners() {
        return runners;
    }

    public List<Flyable> getAllFlyers() {
        return flyers;
    }

    public List<Swimable> getAllSwimmers() {
        return swimmers;
    }
}

