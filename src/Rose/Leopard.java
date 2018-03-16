package Rose;

public class Leopard extends AbstractWild implements ISoundable {

    public void breathe() {
        System.out.println("Я дышу   лёгкими");
    }

    public void sound() {
        System.out.println("Я рычу");
    }
}
