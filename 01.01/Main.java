
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Raven raven = new Raven();
        cat.toFly();
        cat.toSwim();
        cat.toGo();

        raven.toGo();
        raven.toFly();
        raven.toSwim();
    }
}
