public class Array_Literal {
    public void literal() {
        int a [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(a[4]);
        for(int nVar : a) {
            System.out.println(nVar);
        }
        System.out.println("--------------------------------------");
        for(int i=0; i<=8; i++) {

            if(i==6) {
                break;
            }
            System.out.println(a[i]);
        }
    }
    public static void main(String[]args) {
        Array_Literal t1 = new Array_Literal();
        t1.literal();
    }
}
