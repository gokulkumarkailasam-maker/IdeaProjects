public class Multiplication {
    public void type() {
        int i = 1;
        int j = 0;
        while(i<=20) {
            j = i * 5;
            i++;
            System.out.println(j);

        }
    }
    public static void main(String[]args) {
        Multiplication m = new Multiplication();
        m.type();

    }
}
