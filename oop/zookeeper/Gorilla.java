package java_stack.oop.zookeeper;

public class Gorilla extends Mammal {


    public Gorilla(int energyLevel) {
        super(energyLevel);
    }


    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("Gorilla threw something");
    }
    
    public void eatBanana() {
        this.energyLevel += 10;
        System.out.println("Gorilla ate a banana");
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("Gorilla climbed");
    }
}
