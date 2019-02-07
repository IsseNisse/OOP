public class testKomplexaTal {
    public static void main(String[] args) {
        KomplexaTal z1 = new KomplexaTal(2,4);
        KomplexaTal z2 = new KomplexaTal(3,8);
        z1.add(z2);

        System.out.println(z1.add(z2));
    }
}
