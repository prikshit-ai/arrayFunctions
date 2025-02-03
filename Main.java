import java.util.*;
public class Main {
    public static void main(String[] args) {
        UserInput array = new UserInput();
        ArrayFunction choice = new ArrayFunction();

        // Take input once and reuse it
        System.out.println("Enter array;");
        int[] inputArray = array.arrInput();
        System.out.println("enter arraylist");
        ArrayList<Integer> inputList = array.arrayListInput();

        // Perform operations
        choice.consecDiff(inputArray);
        choice.oddEven(inputArray);
        choice.convertArrayToList(inputArray);
        choice.convertListToArray(inputList);
    }
}