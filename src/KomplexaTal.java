public class KomplexaTal {
    double a;
    double b;

    public KomplexaTal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public KomplexaTal add(KomplexaTal z2) {
        double a = this.a + z2.a;
        double b = this.b + z2.b;
        KomplexaTal z3 = new KomplexaTal(a,b);
        return z3;
    }

    public KomplexaTal multiply(KomplexaTal z2) {
        double a = this.a * z2.a;
        double b = this.b * z2.b;
        KomplexaTal z4 = new KomplexaTal(a,b);
        return z4;
    }

        public String toString() {
            return this.a + " + " + this.b + "i";
        }
}
