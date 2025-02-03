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
    public int consecDiff(int[] array) {
        int smallest = Integer.MAX_VALUE; 
        int diff;
        int index = -1; 

        for (int i = 0; i < array.length - 1; i++) {
            diff = Math.abs(array[i + 1] - array[i]); 
            if (diff < smallest) {
                smallest = diff;
                index = i;
            }
        }

        System.out.println("Smallest difference is: " + smallest);
        System.out.println("Index is :" + index);
        return index;
    }
}
