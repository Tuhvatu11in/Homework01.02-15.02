interface Flyable {
    double fly();
}

interface Swimable {
    double swim();
}

interface Goable {
    double run();
}

class Runner implements Goable {
    @Override
    public double run() {
        return 10.0;
    }
}

class Walker implements Goable {
    @Override
    public double run() {
        return 5.0;
    }
}

class Bird implements Flyable {
    @Override
    public double fly() {
        return 30.0;
    }
}

class Plane implements Flyable {
    @Override
    public double fly() {
        return 800.0;
    }
}

class Swimmer implements Swimable {
    @Override
    public double swim() {
        return 5.0;
    }
}

class Fish implements Swimable {
    @Override
    public double swim() {
        return 2.0;
    }
}
