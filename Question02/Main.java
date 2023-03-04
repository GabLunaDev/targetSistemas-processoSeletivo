package Question02;

public class Main {
    public static void main(String[] args) {
        Fibonacci findAValue = new Fibonacci();
        boolean result = findAValue.thisValueIsInFibonacciSequence(33);
        
        if(result){
            System.out.println("This number includes in fibonacci sequence");
        }else{
            System.out.println("Number not found in fibonacci sequence");
        }
    }
}
