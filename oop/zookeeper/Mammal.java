package java_stack.oop.zookeeper;

/**
 * Mammal
 */
public class Mammal {

    protected int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }


    public int DisplayEnergyLevel() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    
}