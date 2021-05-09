import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        // Person person1 = new Person();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Name: ");
        String person1Name = input.nextLine();
        System.out.println("Enter the ID: ");
        String person1Id = input.nextLine();
        System.out.println("Enter the Age: ");
        int person1age = input.nextInt();

        Person person1 = new Person(person1Name, person1age, person1Id); 

        System.out.println("Accessed by using getName method of Age... " + person1.getName(person1age));
        System.out.println("Accessed by using getName method of ID... " + person1.getName(person1Id));

        input.close();
    }
}




class Person{
    String fullName;
    String personId;
    int age;

    // Constructor 1:-
	public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
        //System.out.println("The full name of the person 1 is: " + fullName + "and the age is: " + age);
    }
    
    // Constructor 2:-
    public Person(String fullName, int age, String personId){
        this.fullName = fullName;
        this.age = age;
        this.personId = personId;
        //System.out.println("The full name of the person 1 is: " + fullName + " and the age is: " + age + " and the ID is: " + personId);
    }

    String getName(int age){
        //toString(age);
        return this.fullName;
    }

    String getName(String personId){
        return this.fullName;
    }

}