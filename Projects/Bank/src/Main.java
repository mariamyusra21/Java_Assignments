import java.util.Scanner;

interface MyMenu{
    void createAccount();
    void showAccounts();
    void addAmount();
    void withdrawAmount();
    void changePassword();
    void exitProgram();

}

class MyBank implements MyMenu{
    private Accounts[] users = new Accounts[10];
    private int regUsers = 0;
    Scanner input = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Username: ");
        String userName = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();
        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        Accounts temp = new Accounts(userName,password,amount);
        users[regUsers++] = temp;
        System.out.println("User Registered.");
    }

    public void showAccounts() {
        for (int i = 0; i < regUsers; i++) {
            // (((int)i)+1) ==>  it first converts i into int then adds 1 into the int value i;
            System.out.println("User " + (((int)i)+1) + ", Name: " + users[i].getUserName());
        }
    }

    public void addAmount() {
        this.showAccounts();
        System.out.print("Enter your ID Number: ");
        int id = input.nextInt();
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        users[id-1].depositAmount(amount);
    }

    public void withdrawAmount() {

    }

    public void inquireAmount(){
        this.showAccounts();
        System.out.print("Enter your ID: ");
        int id = input.nextInt();
        System.out.println("Dear " + users[id-1].getUserName() + " your amount is " + users[id-1].getAmount());
    }

    public void changePassword() {

    }

    public void exitProgram() {

    }
}

public class Main{
    public static void greetUser(){
        System.out.println("===============================");
        System.out.println("N : Create New Account");
        System.out.println("S : Show Accounts");
        System.out.println("W : Withdraw Amount");
        System.out.println("A : Inquire Amount");
        System.out.println("D : Deposit Amount");
        System.out.println("P : Change Password");
        System.out.println("E : Exit Program");
        System.out.println("===============================");

    }

    public static void main(String[] args) {
        char key = '\0';
        Scanner input = new Scanner(System.in);
        MyBank bank = new MyBank();

        while (key != 'E'){
            greetUser();
            System.out.print("Enter your choice: ");
            key = input.next().charAt(0);

            switch(key){
                case 'N' :
                    bank.createAccount();
                    break;
                case 'S' :
                    bank.showAccounts();
                    break;
                case 'W' :
                    bank.withdrawAmount();
                    break;
                case 'A' :
                    bank.inquireAmount();
                    break;
                case 'D' :
                    bank.addAmount();
                    break;
                case 'P' :
                    bank.changePassword();
                    break;
                case 'E' :
                    System.out.println("Thank you for visiting us.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice; Please try again");
                    break;
            }       // end og Switch Case
        }           // end of While loop
        input.close();
    }
}