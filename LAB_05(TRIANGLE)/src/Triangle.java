public class Triangle {
    double sideA;
    double sideB;
    double sideC;
    static int count;

    Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        count++;
    }

    Triangle(double X) {
        this.sideA = X;
        this.sideB = X;
        this.sideC = X;
        count++;
    }

    Triangle(double X, double Y) {
        this.sideA = X;
        this.sideB = X;
        this.sideC = Y;
        count++;
    }

    Triangle(double X, double Y, double Z) {
        this.sideA = X;
        this.sideB = Y;
        this.sideC = Z;
        count++;
    }

    Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        count++;
    }

    public void setA(double sideA) {
        this.sideA = sideA;
    }

    public void setB(double sideB) {
        this.sideB = sideB;
    }

    public void setC(double sideC) {
        this.sideC = sideC;
    }

    public double getA() {
        return sideA;
    }

    public double getB() {
        return sideB;
    }

    public double getC() {
        return sideC;
    }

    public static int objectcount() {
        return count;
    }

    public double perimeter() {
        double p = sideA + sideB + sideC;
        return p;
    }

    public boolean isRightAngled() {
        if (sideA > sideB && sideA > sideC) {
            if ((sideB * sideB + sideC * sideC) == (sideA * sideA)) {
                return true;
            }
        } 
        else if (sideB > sideA && sideB > sideC) {
            if ((sideA * sideA + sideC * sideC) == (sideB * sideB)) {
                return true;
            }
        } 
        else if (sideC > sideA && sideC > sideB) {
            if ((sideA * sideA + sideC * sideC) == (sideB * sideB)) {
                return true;
            }
        } 
            return false;
    }
    @Override
    public String toString(){
        return "SIDE A = " + sideA + "\nSIDE B = " + sideB + "\nSIDE C = " + sideC + "\nISRIGHTANGLED = " + isRightAngled() + "\nPERIMETER = " + perimeter();
    }

}
