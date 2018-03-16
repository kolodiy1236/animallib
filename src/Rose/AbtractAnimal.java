package Rose;

public abstract class AbtractAnimal {

    private double weight;

    private int age;

    public void eat() {
        System.out.println("Я ем");
    }

    public void setWeight(double weiht) {
        this.weight=weight;
    } 
    

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        this.age=age;
        
    }

    public int getAge() {
        return this.age;
    }

    public void breathe(){
        System.out.println("Я дышу");
    }
}
