package Rose;

public class Cat extends AbstractPet implements ISoundable {

    public void breathe() {
        System.out.println("Я дышу лёгкими");
    }

    public void sound() {
        System.out.println("Я мяукаю");
    }
    public void eat(){
        System.out.println(" Я кушаю рыбу");
    }
}
