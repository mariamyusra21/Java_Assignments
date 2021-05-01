package Accounts;

public class Amount {
    public void showData(int amount){
        System.out.println("Your Amount is: " + amount);
    }

    public void showData(int amount, String fullName){
        System.out.println("Dear " + fullName + " Your Amount is: " + amount);
    }
}
