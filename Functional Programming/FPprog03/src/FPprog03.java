import java.util.List;


public class FPprog03 {
    public static void main(String[] args) throws Exception {
        
        List<Integer> number = List.of(2, 5, 7, 9, 10);
        List<String> course = List.of("java", "Spring", "Microservice", "Python", "IIB");
    
       //Calling Methods 
        method1(number); // Odd number 
        method2(course); // Print the whole list 
        method3(course); // If contains Spring only print
        method4(course); // if length equal to 4 then print
        method5(number); // Square of the element
        method6(number); // Cube of the element 
        method7(course); // length of the each element in the list
        System.out.println(method8(number)); // Add all the numbers in the list. 
        System.out.println(method9(number)); // Substract all the numbers in the list.
        System.out.println(method10(number)); // Add all the numbers in the list using lambda expression. 
        System.out.println(method11(number)); // Add the square element in the the list 
        System.out.println(method12(number)); //  Add the cube element in the the list 
        System.out.println(method13(number)); // Add the odd element in the list
        
        
    
    
    }

    //Method Declaration
    
    private static void method1(List<Integer> number) {
        System.out.println("I am method1");
        number.stream()
            .filter(var -> var%2 != 0)
            .forEach(System.out::println);
    }

    private static void method2(List<String> course) {
        System.out.println("I am method2");
        course.stream()
            .forEach(System.out::println);
    }

    private static void method3(List<String> course) {
        System.out.println("I am method3");
        String s = "Spring";
        course.stream()
            .filter(var -> var.contains(s))
            .forEach(System.out::println);
    }

    private static void method4(List<String> course) {
        System.out.println("I am method4");
        course.stream()
            .filter(var -> var.length() == 4)
            .forEach(System.out::println);
    }

    private static void method5(List<Integer> number) {
        System.out.println("I am method5");
        number.stream()
            .filter(var -> var%2 == 0)
            .map(var -> var * var)
            .forEach(System.out::println);
            
    }

    private static void method6(List<Integer> number) {
        System.out.println("I am method6");
        number.stream()
            .filter(var -> var%2 != 0)
            .map(var -> var * var * var)
            .forEach(System.out::println);
    }

    private static void method7(List<String> course) {
        System.out.println("I am method7");
        course.stream()
            .map(var -> var.length())
            .forEach(System.out::println);
    }


    //Creating a static method for using in method 8
    //This method will have the sum logic
    private static int sum(int a, int b) {
        return a+b;
    }

    private static int method8(List<Integer> number) {
        return number.stream()
            .reduce(0, FPprog03::sum);
    }


    //Creating a static method for using in method 8
    //This method will have the Substract logic
    private static int sub(int a, int b) {
        if (a > b) {
            System.out.println("I am a>b");
            System.out.println( "A value is" + a);
            System.out.println("B value is" + b);
            return a-b;
        } else {
            System.out.println("I am a>b of else block");
            System.out.println( "A value is" + a);
            System.out.println("B value is" + b);
            return b-a;
        }
    }

    private static int method9(List<Integer> number) {
        return number.stream()
            .reduce(0, FPprog03::sub);
    }


    private static int method10(List<Integer> number) {
        return number.stream()
            .reduce(0, (x,y) -> x+y);
    }

    
    private static int method11(List<Integer> number) {
        return number.stream()
            .map(x -> x*x).reduce(0, Integer::sum);
    }

    private static int method12(List<Integer> number) {
        return number.stream()
            .map(x -> x*x*x).reduce(0, Integer::sum);
    }

    private static int method13(List<Integer> number) {
        return number.stream()
            .filter(x -> x%2 == 1).reduce(0, Integer::sum);
    }
}    