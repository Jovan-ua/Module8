import java.util.Scanner;
public class ShapeChooser {
    private String shapeName;
    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();
    Ellipse ellipse = new Ellipse();
    public void shapeScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your Shape");
        shapeName = scanner.nextLine();
    }
    public String shapeChoose(){
        String errorShape = "Try another Shape";
        switch (shapeName.toLowerCase()){
            case "circle":
                return circle.getShape();
            case "square":
                return square.getShape();
            case "triangle":
                return triangle.getShape();
            case "rectangle":
                return rectangle.getShape();
            case "ellipse":
                return ellipse.getShape();
            default:
                return errorShape;

        }
    }
}
