public class testKomplexaTal {
    public static void main(String[] args) {
        KomplexaTal z1 = new KomplexaTal(2,4);
        KomplexaTal z2 = new KomplexaTal(3,8);
        KomplexaTal z3 = z1.add(z2);
        KomplexaTal z4 = z1.multiply(z2);
        double v = z1.args();

        if (z1.equals(z2)) {
            System.out.println("lika");
        } else {
            System.out.println("olika");
        }
        System.out.println(z1);
    }
}
