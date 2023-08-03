//declare the class name 'public class Factorial' and its function '{}'
//the class is set to public which means it can be accessed by any other class
public class Factorial {
    //declare the class method
    //set the argument to be passed through the method in this case its 'int n'
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
