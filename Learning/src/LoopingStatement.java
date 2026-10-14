public class LoopingStatement {
    public static void main(String[]args) {
        LoopingStatement s = new LoopingStatement();
        s.type1();
    }
    public void type1() {
        int i = 10;
        while(i <15) {
            i++;
            i++;
            System.out.println(i);

        }
    }

}

