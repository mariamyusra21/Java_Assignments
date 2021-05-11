interface Tree{
    // In Interface the attributes are static final by default.         As we know final variables' value can not be changed...
    // In Interface the methods are abstract by default.
    int height =10;
    int getHeight();
    void setHeight(int h);
}

class Mango implements Tree{
    int expHeight = height;
    
    public int getHeight(){
        return expHeight;
    }

    public void setHeight(int h){
        expHeight = height + h;
    }
}


public class Main{
public static void main(String[] args) {
    Mango m = new Mango();
    System.out.println(m.getHeight());
    m.setHeight(2);
    System.out.println(m.getHeight());
}
}