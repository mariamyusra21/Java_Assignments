package Accounts;

public class Account {
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

    private void showAmount(){
        System.out.println(this.amount);
    }

    public void login(String password){
        if (password.equals(this.password)){
            this.showAmount();
        }
        else{
            System.out.println("Access Denied!!!");
        }
    }

    public void showPassword(){
        System.out.println("a.showPassword(): " + this.password);
    }

}
