import java.util.List;

/*
 * This Prog is going to demonstrate the logic and implementation of traditional approach and functional style approach.
 * Method1 - Traditional Approach Way
 * Method2 - Functional Approach Way
 */
public class FP01 {

    public static void main(String[] args) {
        // Creat a list of number 
        // Any random numbers we will pass in a method and method has to print all the number in a list
        
        //Traditional Approach
            //Calling the method by passing the list as an argument
            method1(List.of(2,3,2,6,7,12,99,101));

        //Functional Approach    
            //Calling the method by passing the list as an argument
            method2(List.of(2,3,2,6,7,12,99,101));

        //Create a variable and assign all the list to it
        List<Integer> number = List.of(2,3,2,6,7,12,99,101);
            //calling the method by passing the List variable as an argument
            method3(number);

        //functional approach for even number findings
            //calling method4
            method4(number);
        
        //functional approach for even number using lambda expression
            //calling method4
            method5(number);
    
}

    //Defining the method body to write the itteration logic in it.
    //[imp] List<Integer> number - FP01Structured.method1(List<Integer>)
    /*
     * Here List<Integra> number -: We are passing the number in whole and type is List
     */
    private static void method1(List<Integer> number) {
        
        for (Integer integer : number) {
            System.out.println(integer);
        }

    }

    /*
     * print and method2 are the interrelated methods
     */
    private static void  print(int number) {
        System.out.println(number);
    }

    private static void method2(List<Integer> number) {
        /*
         * FP01::print - Method Reference in functional programming
         * number.stream() - stream() helps to Stream line the input 
         * [imp]forEach(FP01::print) - helps to itterate each stream and calling the static method which present in class FP01.
         */
        number.stream().forEach(FP01::print);

    }
    
    /*
     * method3 is having the direct call to the System class println method - compressed version
     */
    private static void method3(List<Integer> number) {
        number.stream()
            .forEach(System.out::println);
    }


    /*
     * Create a Iseven method for passing the Steam element to check the even and odd condition
     * Method4 is a not compressed version of implementing functional programming
     */
    private static boolean isEven(int num) {
        return num%2 == 0;
    }

    private static void method4(List<Integer> number) {
        number.stream()
            .filter(FP01::isEven)
            .forEach(System.out::println);
    }

    /*
     * mrthod5 - Using the Lambda expression in functional programming
     */

    private static void method5(List<Integer> number) {
        
        System.out.println("I am method5");
        number.stream()
            .filter(var -> var%2 == 0)
            .forEach(System.out::println);
            
    }
}