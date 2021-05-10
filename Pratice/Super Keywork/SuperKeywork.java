class Parent{
    private String fathername;
    private String mothername;

    public Parent(String fathername, String mothername){
        this.fathername = fathername;
        this.mothername = mothername;
    }

    public String getFatherName(){
        return this.fathername;
    }

    public String getMotherName(){
        return this.mothername;
    }

    public void printParentName(){
        System.out.println(this.fathername + " and " + this.mothername);
    }

}


class Child extends Parent{
    private String childName;

    public Child(String childName, String fatherName, String motherName){
        super(fatherName, motherName);
        this.childName = childName;
    }

    public void printParentName(){
        System.out.print(super.getFatherName() + " (Father) " + super.getMotherName() + " (Mother).");
    }

    public void printChildName(){
        System.out.print(this.childName + " is child of ");
        this.printParentName();
        System.out.println();
    }
}

public class SuperKeywork{
    public static void main(String[] args) {
        Child c1 = new Child("John", "Bill", "Marry");
        c1.printChildName();
        Child c2 = new Child("Harry", "Bill", "Marry");
        c2.printChildName();
        Child c3 = new Child("Ibrahim", "Mark", "August");
        c3.printChildName();
    }
}