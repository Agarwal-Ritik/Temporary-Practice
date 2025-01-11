import java.util.Scanner;  

public class duplicate {  
    public static void main(String[] args) {  
        Scanner sc= new Scanner(System.in);   
        System.out.print("Enter the number of elements in the array: ");  
        int size = sc.nextInt();  
        int[] array = new int[size];   
        System.out.println("Enter the elements of the array:");  
        for (int i = 0; i < size; i++) {  
            array[i] = sc.nextInt();  
        }   
        System.out.println("Duplicate elements in the array:");  
        boolean foundDuplicate = false; 
        for (int i = 0; i < size; i++) {  
            for (int j = i + 1; j < size; j++) {  
                if (array[i] == array[j]) {  
                    foundDuplicate = true;  
                    System.out.println(array[i]);  
                    break; 
                }  
            }  
        }  
  
        if (!foundDuplicate) {  
            System.out.println("No duplicate elements found.");  
        }  

        
        sc.close();  
    }  
}
