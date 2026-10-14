public class Dowhile {
    public void type() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
            i++;
            i++;
        } while (i <= 15);
    }
    public static void main(String[]args) {
        Dowhile d = new Dowhile();
        d.type();
    }
}