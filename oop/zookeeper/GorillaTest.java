package java_stack.oop.zookeeper;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla g = new Gorilla(100);
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBanana();
        g.eatBanana();
        g.climb();
        System.out.println(g.DisplayEnergyLevel());

    }
}
