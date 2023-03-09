package java_stack.oop.zookeeper;

public class Bat extends Mammal {

    public Bat() {
        // this.setEnergyLevel(300);
        super(300);
    }

    public void fly(){
        this.energyLevel -= 50;
        System.out.println("Bat is flying");
    }

    public void eathuman() {
        this.energyLevel += 25;
    }

    public void attackTown(){
        this.energyLevel += 100;
        System.out.println("AAAAAHH!!!!!!!! PLEASE STOP!!!!!!! NOOOOOOO!!!!!!");
    }

    }
