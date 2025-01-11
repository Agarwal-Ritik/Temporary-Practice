import java.util.Scanner;
public class frequency {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int[] array=new int[size];
     for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
     }
     boolean[] counted=new boolean[size];
    for(int i=0;i<size;i++){
        if(!counted[i]){
            int count=1;
            for(int j=i+1; j<size;j++){
                if (array[i]==array[j]){
                    count++;
                    counted[j]=true;
                }

            }
            System.out.println("Element"+ array[i]+ "=Frequency"+ count);
        }
        sc.close();
    }
    }
    
}
