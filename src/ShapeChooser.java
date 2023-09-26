import java.util.Scanner;
public class ShapeChooser {
    private String userShapeName;
    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();
    Ellipse ellipse = new Ellipse();
    Shape shape = null;
    public void shapeScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your Shape");
        userShapeName = scanner.nextLine();
    }
    public void shapeChoose(){

        String errorShape = "Try another Shape";
        switch (userShapeName.toLowerCase()){
            case "circle":
                 shape = new Circle();
                 break;
            case "square":
                 shape = new Square();
                 break;
            case "triangle":
                shape = new Triangle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
            case "ellipse":
                shape = new Ellipse();
                break;
            default:
                System.out.println("Try another Shape");
                System.exit(1);

        }
ShapeNamePrinter shapeNamePrinter = new ShapeNamePrinter();
        shapeNamePrinter.printShapeName(shape);
    }

    }

