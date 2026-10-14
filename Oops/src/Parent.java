public class Parent {
    public void parent_1() {
        System.out.println("Father");
    }
    public void parent_2() {
        System.out.println("Mother");
    }
    private void fathername() {
        System.out.println("Father Name");
    }
    private void mothername() {
        System.out.println("Mother Name");
    }
    public static void main(String[]args) {
        Parent p = new Parent();
        p.parent_1();
        p.parent_2();
        p.fathername();
        p.mothername();
    }
}
