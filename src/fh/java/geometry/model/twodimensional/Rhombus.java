package fh.java.geometry.model.twodimensional;

/**
 * Created by Florian on 10.11.2016.
 */
public class Rhombus extends TwoDimensionalShape {

    protected double diagonalE;
    protected double diagonalF;

    public Rhombus() {

    }

    public Rhombus(int x, int y, double sideA, double diagonalE, double diagonalF) {
        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.diagonalE = diagonalE;
        this.diagonalF = diagonalF;
    }

    public double getDiagonalE() {
        return diagonalE;
    }

    public void setDiagonalE(double diagonalE) {
        this.diagonalE = diagonalE;
    }

    public double getDiagonalF() {
        return diagonalF;
    }

    public void setDiagonalF(double diagonalF) {
        this.diagonalF = diagonalF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rhombus rhombus = (Rhombus) o;

        if (Double.compare(rhombus.diagonalE, diagonalE) != 0) return false;
        return Double.compare(rhombus.diagonalF, diagonalF) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(diagonalE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diagonalF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rhombus{");
        sb.append("sideA=").append(sideA);
        sb.append(", diagonalE=").append(diagonalE);
        sb.append(", diagonalF=").append(diagonalF);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());

        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcArea() {
        return (diagonalE*diagonalF)/2;
    }

    @Override
    public double calcPerimeter() {
        return sideA*4;
    }
}

