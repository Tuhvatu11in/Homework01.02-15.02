
public class Animal {
    public void toFly() {
        System.out.print("Летает");
    }

    public void toGo() {
        System.out.print("Ходит");
    }

    public void toSwim() {
        System.out.print("Плавает");
    }
}

class Cat extends Animal {
    @Override
    public void toFly() {
        System.out.print("Разбилось");
    }
}

class Raven extends Animal {
    @Override
    public void toGo() {
        System.out.print("Не ходит (лапки маленькие)");
    }
}