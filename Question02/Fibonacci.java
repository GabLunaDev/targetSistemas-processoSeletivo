package Question02;

public class Fibonacci {

    private int[] fibonacciArray;
    private int currentValueIndex;

    public Fibonacci(){
        this.fibonacciArray = new int[2];
        
        for (int i = 0; i < this.fibonacciArray.length; i++) {
            this.fibonacciArray[i] = i;
        }

        this.currentValueIndex = this.fibonacciArray.length - 1;
    }

    public boolean thisValueIsInFibonacciSequence(int value){
        return itIsInFibonacciSequenceRecursive(value, this.currentValueIndex, this.fibonacciArray);
    }

    private boolean itIsInFibonacciSequenceRecursive(int valueToFind, int currentIndex, int[] fibonacciSequence){
        if(fibonacciSequence[currentIndex] == valueToFind || valueToFind == 0){
            return true;
        }

        if(fibonacciSequence[currentIndex] > valueToFind){
            return false;
        }

        currentIndex++;
        
        if(fibonacciSequence.length <= currentIndex){
            fibonacciSequence = increaseArrayLength(fibonacciSequence);
        }

        fibonacciSequence[currentIndex] = fibonacciSequence[currentIndex - 1] + fibonacciSequence[currentIndex - 2];

        return itIsInFibonacciSequenceRecursive(valueToFind, currentIndex, fibonacciSequence);
    }

    private int[] increaseArrayLength(int[] fibonacciSequence){
        int[] newArray = new int[fibonacciSequence.length * 2];

        for (int i = 0; i < fibonacciSequence.length; i++) {
            newArray[i] = fibonacciSequence[i];
        }

        return newArray;
    }
}
