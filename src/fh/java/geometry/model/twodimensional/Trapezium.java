package fh.java.geometry.model.twodimensional;

/**
 * Created by Florian on 10.11.2016.
 */
public class Trapezium extends TwoDimensionalShape {

    protected double sideB;
    protected double sideC;
    protected double sideD;
    protected double heightA;

    public Trapezium() {
    }

    public Trapezium(int x, int y, double sideA, double sideB, double sideC, double sideD, double heightA) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.heightA = heightA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getHeightA() {
        return heightA;
    }

    public void setHeightA(double heightA) {
        this.heightA = heightA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezium trapezium = (Trapezium) o;

        if (Double.compare(trapezium.sideB, sideB) != 0) return false;
        if (Double.compare(trapezium.sideC, sideC) != 0) return false;
        if (Double.compare(trapezium.sideD, sideD) != 0) return false;
        return Double.compare(trapezium.heightA, heightA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heightA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapezium{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideD=").append(sideD);
        sb.append(", heightA=").append(heightA);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }



    @Override
    public double calcArea() {
        return ((sideA +sideC)/2) * heightA;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB+ sideC + sideD;
    }
}
