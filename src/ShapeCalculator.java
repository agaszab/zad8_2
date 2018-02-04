public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public int ballVolume(Ball ball) {     //  oblicza pojemność przekazanej jako argument kuli
        int pojemnosc=0;

        return  pojemnosc= (int) ((4/3)*Math.PI*Math.pow(ball.getPromien(),3));
    }

    @Override
    public int cubeVolume(Cube cube) {       //  oblicza pojemność przekazanego jako argument sześcianu
        int pojemnosc=0;

        return pojemnosc= (int) Math.pow(cube.getDlugoscBoku(),3);
    }


    @Override
    public int circleArea(Circle circle) {      //oblicza pole przekazanego jako argument koła
        int pole=0;

        return pole= (int) (Math.PI*Math.pow(circle.getPromien(),2));

    }

    @Override
    public int rectangleArea(Rectangle rectangle) {   // oblicza pole przekazanego jako argument prostokąta
        int pole=0;

        return pole=rectangle.getBokA()*rectangle.getBokB();
    }


}
