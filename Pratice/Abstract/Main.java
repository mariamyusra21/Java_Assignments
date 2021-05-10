abstract class Tree{
    int height;

    abstract int getHeight();
    abstract void setHeight(int h);

}


class Mango extends Tree{
    int getHeight(){
        return height;
    }

    void setHeight(int h){
        height = h;
    }

}

public class Main{
    public static void main(String[] args) {

        final int x = 20;
        System.out.println(x);

        Mango m1 = new Mango();
        Mango m2 = new Mango();

        System.out.println(m1.getHeight());
        m1.setHeight(10);
        System.out.println(m1.getHeight());
        System.out.println();

        System.out.println(m2.getHeight());
        m2.setHeight(20);
        System.out.println(m2.getHeight());
    }
}