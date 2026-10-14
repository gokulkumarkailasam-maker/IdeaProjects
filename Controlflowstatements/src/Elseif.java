public class Elseif {
    public void type() {
        int mark = 80;
        if(mark<35) {
            System.out.println("Fail");

        }
        else if((mark>35) && (mark<=50)) {
            System.out.print("Grade C");
        }
        else if((mark>50) && (mark<=90)) {
            System.out.print("Grade B");
        }
        else if((mark>90) && (mark<=100)) {
            System.out.print("Grade A");

        }
        else {
            System.out.print("Unknown Error");
        }
        if(mark<0) {
            System.out.print("Wrong Value Entered");
        }

    }
    public static void main(String[]args) {
        Elseif e = new Elseif();
        e.type();

    }
}
