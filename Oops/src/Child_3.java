public class Child_3 extends Child_2{
    public void childThreeName() {
        System.out.println("Child Three Name");
    }
    public void childThreeAge() {
        System.out.println("Child Three Age");
    }
    public static void main(String[]args) {
        Child_3 c3 = new Child_3();
        c3.childThreeName();
        c3.childThreeAge();
        c3.childTwoName();
        c3.childTwoAge();
        c3.childOneName();
        c3.childOneAge();
        c3.parent_1();
        c3.parent_2();
    }
}
