package zoo.animals;

public class Lion extends Animal implements Soundable {

    public Lion(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return name + ": Рррр!";
    }

    @Override
    public String getInfo() {
        return "Лев " + name;
    }
}