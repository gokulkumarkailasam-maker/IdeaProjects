public class Starpattern_Four_To_Four {
    public void type() {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=4;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Starpattern_Four_To_Four s = new Starpattern_Four_To_Four();
        s.type();

    }
}
