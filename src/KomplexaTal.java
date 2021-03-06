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
        double c = this.a * z2.b;
        double d = this.b * z2.a;
        KomplexaTal z3 = new KomplexaTal(a-b,c+d);
        return z3;
    }

    public double args() {
        double a = this.b / this.a;
        double v = Math.atan(a);
        return v;
    }

    public boolean equals(KomplexaTal z2) {
        if (this.a == z2.a && this.b == z2.b) {
            return true;
        } else {
            return false;
        }
    }

        public String toString() {
            return this.a + " + " + this.b + "i";
        }
}
