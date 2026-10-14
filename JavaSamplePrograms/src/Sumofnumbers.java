public class Sumofnumbers {
    public void type() {
        int i = 1;
        int j = 0;

        while(i<=10) {
            j = j+i;
            i++;
            System.out.println(j);


        }
    }
    public static void main(String[]args) {
        Sumofnumbers s = new Sumofnumbers();
        s.type();


    }
}
