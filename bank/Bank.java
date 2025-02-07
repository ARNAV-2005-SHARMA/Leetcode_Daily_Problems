package bank;

class Account { // Access Modifiers --> types =>(1).public (2).Default (3)Protected (4).Private
    String random;
    public String name;
    protected String email;
    private String password;

    // getters & setters
    /*
     * public String getPassword(){ //getters
     * return this.password
     * }
     */
    public String getPassword() {
        setPassword(random);
        return this.password;
    }

    private void setPassword(String pass) { // setters
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Apna college";
        account1.email = "apna@gmail.com";
        account1.setPassword("abcd"); // private(can't include in main class)
        System.out.println(account1.getPassword());
    }
}
