import java.util.ArrayList;

public class ArrayFunction {

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println("ArrayList is: " + array);
    }

    // Method to display an array
    public void displayArr(int[] array) {
        System.out.print("Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Method to separate odd and even numbers into different lists
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

    // Method to find the index where the smallest consecutive difference occurs
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
        System.out.println("Index is: " + index);
        return index;
    }

    // Method to convert an array to an ArrayList
    public ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        display(arrayList); // Display the converted list
        return arrayList;
    }

    // Method to convert an ArrayList back to an array
    public int[] convertListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        displayArr(array); // Display the converted array
        return array;
    }
}
