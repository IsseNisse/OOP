public class testCircle {
    public static void main(String[] args) {
        circle c1 = new circle(0,0,3);
        circle c2 = new circle(0,0,3);
        if (c1.equals(c2)) {
            System.out.println("lika");
        } else {
            System.out.println("olika");
        }
        System.out.println(c1);
    }
}
