public class SingleInHeritance extends Modifier {
    public void addition() {
        System.out.println("Add");
    }
    public void subtraction() {
        System.out.println("Sub");
    }
    public static void main(String[]args) {
        SingleInHeritance sih = new SingleInHeritance();
        sih.addition();
        sih.subtraction();
        sih.register();
        sih.profile();
        sih.logout();
        sih.name();

    }
}
