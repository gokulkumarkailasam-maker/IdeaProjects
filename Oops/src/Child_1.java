public class Child_1 extends Parent{
    public void childOneName() {
        System.out.println("Child 1 Name");
    }
    public void childOneAge() {
        System.out.println("Child 1 Age");
    }
    public static void main(String[]args) {
        Child_1 c1 = new Child_1();
        c1.childOneName();
        c1.childOneAge();
        c1.parent_1();
        c1.parent_2();

    }
}
