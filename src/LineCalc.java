import static java.lang.Math.*;

public class LineCalc {

    public double lineLength (Line2D line) {                   // oblicza długość przekazanego jako argument odcinka
        double dlugosc;
        double a = 0;
        double b = 0;

        a = Math.pow(line.getbX() - line.getaX(), 2);
        b = Math.pow(line.getbY() - line.getaY(), 2);
        return dlugosc = Math.sqrt(a - b);

    }

}
