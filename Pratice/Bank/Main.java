import Accounts.Account;
import Accounts.Amount;

public class Main{
    public static void main(String[] args) {
        Account acc1 = new Account("Mariam Yusra", "myusra", "memon", 26000);
        Account acc2 = new Account("Ayesha Aijaz", "ayesha", "imagination", 35000);

        System.out.println("acc1.fullName: " + acc1.fullName);
        System.out.println("acc1.userName: " + acc1.userName);
        acc1.login("memon");
        System.out.println("-------------------------------------------");


        System.out.println("acc2.fullName: " + acc2.fullName);
        System.out.println("acc2.userName: " + acc2.userName);
        acc2.login("imagination");
        System.out.println("-------------------------------------------");

        // Amount amount1 = new Amount();
        // amount1.showData();

    }
}