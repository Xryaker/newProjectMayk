import java.util.Locale;

public class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName() + " says Woof");
    }

    void greets(Dog another) {
        System.out.println("Wooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("WALK");
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public String toString() {
        return getName() + " can play.....";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (this == obj) return true;

        if (!(obj instanceof Dog)){
            System.out.println("Object not instance of Dog. It is "+obj.getClass());
            return false;}

        Dog dog = (Dog) obj;

        if (dog.getName().equalsIgnoreCase(this.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
