import java.util.Scanner;
public class copyarray {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
     int[] original=new int[size];
     for(int i=0;i<size;i++){
        original[i]=sc.nextInt();
     }
     int[] copy= new int[size];
     for(int i=0;i<size;i++){
      copy[i]=original[i];
     }
     System.out.println("Copied array= ");
     for (int i=0;i<size;i++){
        System.out.print(copy[i]+" ");
     }
     sc.close();
    }
    
}
