import java.util.List;


public class FPProg02 {
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



}    
