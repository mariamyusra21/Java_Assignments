public class Accounts {
    private String userName;
    private String password;
    private double amount;

    public Accounts(String userName, String password, double amount) {
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public double getAmount() {
        return this.amount;
    }

    public void depositAmount(double amount){
        System.out.print("Your current amount is " + this.amount);
        this.amount += amount;
        System.out.println(" and after deposit: " + this.amount);
    }

    public void setPassword(String password) {
        if (this.password.equals(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid Password...");
        }
    }
}