import java.util.ArrayList;

public class ArrayFunction {

    
    public void display(ArrayList<Integer> array) {
        System.out.println("Array is: " + array);
    }

    
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        System.out.println("Even numbers:");
        display(even);

        System.out.println("Odd numbers:");
        display(odd);
    }