public class Extended_Interface implements InterfaceOne,InterfaceTwo {
    public void animal() {
        System.out.println("Lion");
    }
    public void bird() {
        System.out.println("Pigeon");
    }
    public void vehicle() {
        System.out.println("Bus");
    }
    public void planet() {
        System.out.println("Earth");
    }
    public void fruit() {
        System.out.println("Apple");
    }
    public static void main(String[]args) {
        Extended_Interface ei = new Extended_Interface();
        ei.animal();
        ei.bird();
        ei.vehicle();
        ei.planet();
        ei.fruit();
    }
}
