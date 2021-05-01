package Accounts;

public class Account extends Amount{
    public String fullName;
    public String userName;
    private String password;
    protected int amount;

    public Account(String fullName, String userName, String password, int amount){
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    @Override
    public void showData(int amount){
        System.out.println(" Your Amount is: " + amount + " and this is Overloaded method...");
    }

    private void showAmount(){
        System.out.println(this.amount);
    }

    public void login(String password){
        if (password.equals(this.password)){
            // this.showAmount();
            this.showData(amount);
            this.showData(amount, fullName);                // Inheriting the method of Amount class in Account class (without making object)...
        }
        else{
            System.out.println("Access Denied!!!");
        }
    }

    public void showPassword(){
        System.out.println("a.showPassword(): " + this.password);
    }

}
