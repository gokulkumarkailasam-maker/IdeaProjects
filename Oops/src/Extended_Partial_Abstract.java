public class Extended_Partial_Abstract extends Partial_Abs {
    public void add() {
        System.out.println("Abstract Method");
    }
    public void sub() {
        System.out.println("Non Abstract Method");
    }
    public void mul() {
        System.out.println("Abstract Method");
    }
    public void calculation() {
        int a = 9;
        if( a <=10) {
            System.out.println("Number is Less than Ten");

        }
    }
    public void Name() {
        String name = "GokulkumarS";
        String name2 = "Gowtham";
        System.out.println(""+name);
        System.out.println(""+name2);
    }
    public static void main(String[]args) {
        Extended_Partial_Abstract ep = new Extended_Partial_Abstract();
        ep.add();
        ep.sub();
        ep.mul();
        ep.calculation();
        ep.Name();

    }
}
