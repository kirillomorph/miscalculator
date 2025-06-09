import java.util.Scanner;

public class Miscalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type first number: ");
        double firstInput = scan.nextDouble(); //do pizdy tvoi dably, kogda u tebya nextInt ili nextLine, geniy
        
        System.out.print("Type symbol: ");
        String symbol = scan.nextLine();
        symbol = scan.nextLine(); //much questions to this line
        
        System.out.print("Type second number: ");
        double secondInput = scan.nextDouble();
        
        System.out.print("Result: ");
        double result;
        
        if (symbol.equals("+")) {
            result = sum(firstInput, secondInput);
        } else if (symbol.equals("-")) {
            result = min(firstInput, secondInput);
        } else if (symbol.equals("*")) {
            result = umn(firstInput, secondInput);
        } else if (symbol.equals("/")) {
            result = del(firstInput, secondInput);
        } else if (symbol.equals("^")) {
            result = ste(firstInput, secondInput);
        } else {
            result = 0; //for what????? we have system.exit down....
            System.out.println("man... only +, -, *, / and ^");
            System.exit(0);
        }
        
        System.out.println(result);
        
        scan.close();
    }
    
    public static double sum (double a, double b) {
        return a + b;
    }
    
    public static double min (double a, double b) {
        return a - b;
    }
    
    public static double umn (double a, double b) {
        return a * b;
    }
    
    public static double del (double a, double b) {
        if (b == 0) {
            System.out.println("man... why are you so idiot?");
            System.exit(0);
        }
        return a / b; //without else, `cause we MUST return something in any case & doesn`t matter that we exit the program upper, i think so
    }
    
    public static double ste (double a, double b) {
        return Math.pow(a, b);
    }
}