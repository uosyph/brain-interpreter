import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Interpreter interpreter = new Interpreter(Interpreter.MEMORY);

        // promotes user to input the code
        Scanner input = new Scanner(System.in);
        System.out.println("The code Must be on the same line");
        System.out.println("Input Code :");
        interpreter.interpret(input.next());

        input.close();
    }
}
