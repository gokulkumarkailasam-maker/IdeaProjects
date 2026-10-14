public class Child_2 extends Child_1{
    public void childTwoName() {
        System.out.println("Child Two Name");
    }
    public void childTwoAge() {
        System.out.println("Child Two Age");
    }
    public static void main(String[]args) {
        Child_2 c2 = new Child_2();
        c2.childTwoName();
        c2.childTwoAge();
        c2.parent_1();
        c2.parent_2();
        c2.childOneName();
        c2.childOneAge();
    }
}
