import java.util.Scanner;
public class Trigonometry {

    // TODO: Create 'public static double sine(double angle)'
    

    // TODO: Create 'public static double cosine(double angle)'
    

    
        // TODO: Read angle
        // TODO: Call sine() and cosine()
        // TODO: Print results in the required format

    public static double sine(double angle){
        return Math.sin(Math.toRadians(angle));

        }
    public static double cosine(double angle){
        return Math.cos(Math.toRadians(angle));
          
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {
            double angle = scanner.nextDouble();

            double s = sine(angle);
            double c = cosine(angle);

            System.out.println("Sine: " + s);
            System.out.println("Cosine: " + c);
        }

        scanner.close();
    }
    
}
