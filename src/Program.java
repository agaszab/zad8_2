public class Program {

    public static void main(String[] args) {

        Line2D odcinek = new Line2D(2, 2, 5, 4);
        LineCalc lcalc = new LineCalc();
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Długość odcinka o współrzędnych: A (" + odcinek.getaX() + "," + odcinek.getaY() + "), B (" + odcinek.getbX() + "," + odcinek.getbY() + ") jest równa:  " + lcalc.lineLength(odcinek));

        Circle circle = new Circle(6);
        System.out.println("Pole koła o promieniu: "+circle.getPromien()+" jest równe: " + shapeCalculator.circleArea(circle));

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Pole prostokąta o bokach " + rectangle.getBokA() + " i " + rectangle.getBokB() + " jest równe: " + shapeCalculator.rectangleArea(rectangle));

        Ball ball = new Ball(6);
        System.out.println("Pole kóli o promieniu " +ball.getPromien()+" jest równe: "+ shapeCalculator.ballVolume(ball));

        Cube cube=new Cube(8);
        System.out.println("Pole sześcianu o boku " +cube.getDlugoscBoku()+" jest równa: "+shapeCalculator.cubeVolume(cube));

    }
}
