package zoo.animals;

public class Penguin extends Animal implements Soundable {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + ": Ку-ку-куа!";
    }

    @Override
    public String getInfo() {
        return "Пингвин " + name;
    }
}