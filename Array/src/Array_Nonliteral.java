public class Array_Nonliteral {
    public void non_Literal() {
        int a [] =new int[6];
        a[4]=78;
        a[1]=88;
        a[3]=99;
        a[2]=95;
        a[5]=44;
        a[0]=26;

        System.out.println("Using Particular Index Value:"+a[4]);
        System.out.println("Using For Loop");

        for(int i = 3; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("For Each");
        for(int nVar : a) {     //for Each
            System.out.println(nVar);
        }
    }
    public void tda() {
        int a [][] = new int [5][4];
        a[0][0]=4;
        a[1][1]=6;
        a[2][1]=7;
        a[3][1]=8;
        a[4][1]=9;
        a[4][2]=7;
        System.out.println("Particular Index place:"+a[0][0]);
        System.out.println("Using For Loop");
        for(int i=2;i<4;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("For Each");
        for(int nVar[]:a) {
            for(int col:nVar) {
                System.out.print(col);

            }
            System.out.println();
        }

    }

    public static void main(String[]args) {
        Array_Nonliteral t1 = new Array_Nonliteral();
        t1.non_Literal();
        t1.tda();
    }
}
