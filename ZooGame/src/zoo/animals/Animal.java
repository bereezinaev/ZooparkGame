package zoo.animals;

public abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //абстрактный метод — каждый вид описывает себя по-своему
    public abstract String getInfo();
}