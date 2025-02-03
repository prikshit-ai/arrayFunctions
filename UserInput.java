import java.util.*;
public class UserInput {
     // Method to take Array as input
    public int[] arrInput(){
        Scanner cf = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("enter 5 numbers :");
        for (int i = 0; i < 5; i++) {
            array[i] = cf.nextInt();
            
        }
        return array ;// Return the Array


    }
    

        // Method to take ArrayList as input
        public ArrayList<Integer> arrayListInput() {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> arrayList = new ArrayList<>();
            System.out.println("Enter 5 numbers:");
    
            for (int i = 0; i < 5; i++) {
                int number = scanner.nextInt();
                arrayList.add(number); // Add the input number to the ArrayList
            }
    
            return arrayList; // Return the ArrayList
        
    
}
}
