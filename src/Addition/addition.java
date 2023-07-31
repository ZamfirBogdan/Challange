package Addition;

public class addition {
    private int x;
    private int y;


    public void setX(int x) {
        this.x = x;
        System.out.println("First number it's : "+x);
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("Second number it's : "+y);
    }
    public String addition(){
        return "Addition it's : "+ (x+y);
    }
}
