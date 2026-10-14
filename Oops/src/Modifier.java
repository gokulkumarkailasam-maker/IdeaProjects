public class Modifier {
    public void register() {
        System.out.println("Register");

    }
    private void login() {
        System.out.println("Login");

    }
    protected void profile() {
        System.out.println("Profile Page");

    }
    void logout() {
        System.out.println("Logout");

    }

    public void name() {

        System.out.println("Gokulkumar");
    }
    public static void main(String[] args) {
        Modifier m = new Modifier();
        m.register();
        m.login();
        m.profile();
        m.logout();


    }
}
