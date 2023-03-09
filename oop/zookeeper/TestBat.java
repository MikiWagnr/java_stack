package java_stack.oop.zookeeper;

public class TestBat {
    public static void main(String[] args) {
    Bat b = new Bat();
    b.attackTown();
    b.attackTown();
    b.attackTown();
    b.eathuman();
    b.eathuman();
    b.fly();
    b.fly();
    System.out.println(b.DisplayEnergyLevel());
    }
}