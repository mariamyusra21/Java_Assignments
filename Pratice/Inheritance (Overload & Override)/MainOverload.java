// extends ->  used for INHERITENCE ->  One class is added in another class and without making
//                                      any object of parent class we can call the methods of the parent class
//                                      from the child class's main method...

// Child class      OR SubClass
public class MainOverload extends MyMath1{

    // Overloading is also known as Polymorphism  ->  Same methods having same parameters but having different behaviours...
    // Overloading by making an Exact method in child class as present in the parent class but its behavious (return type) will be different...
   // @Override
    int power(int x){
       return x * x * x;
   }
    public static void main(String[] args) {
        MainOverload obj = new MainOverload();
        System.out.println(obj.power(25));
    }
}


// Parent class     OR SuperClass
class MyMath1{
    int power(int x){
        return x * x;
    }
}