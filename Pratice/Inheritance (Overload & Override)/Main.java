public class Main{
    public static void main(String[] args) {
        MyMath op = new MyMath();
        System.out.println(op.addNum(144, 167, 678));
        System.out.println(op.addNum(144.7F, 167.8F));
        System.out.println(op.addNum(144, 167));
    }
}


class MyMath{
    int addNum(int a, int b){
        System.out.println("Executed [int addNum(int a, int b)]");
        return a + b;
    }

    // Override # 1 by changing data types...
    float addNum(float a, float b){
        System.out.println("Executed [float addNum(float a, float b)]");
        return a + b;
    }

    // Override # 2 by changing the parameters...
    int addNum(int a, int b, int c){
        System.out.println("Executed [int addNum(int a, int b, int c)]");
        return a + b + c;
    }
}