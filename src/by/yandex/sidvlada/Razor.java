package by.yandex.sidvlada;

public abstract class Razor implements Socket{

    String name;
    Razor() {
        this.name = name;
    }

    protected void turnOn() {
        System.out.println("Devices " +this+ " is working");
    }

    @Override
    public String toString() {
        return name;
    }

}
