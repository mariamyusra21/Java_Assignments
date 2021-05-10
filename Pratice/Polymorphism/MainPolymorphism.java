public class MainPolymorphism{

    public void myprint(int x){
        System.out.println("New version of printing the integer");
        System.out.print(x);
        System.out.println();
    }
    public static void main(String[] args) {
        MyScanner obj = new MyScanner();
        MainPolymorphism obj1 = new MainPolymorphism();

        obj1.myprint(77);
        obj.myPrint(77);
        
    }
}


class MyScanner {
    
    public void printLine(){
        System.out.println();
    }

    public void myPrint(int x){
        System.out.print(x);
        this.printLine();
    }

    public void myPrint(float x){
        System.out.print(x);
        this.printLine();
    }

    public void myPrint(String x){
        System.out.print(x);
        this.printLine();
    }
}
