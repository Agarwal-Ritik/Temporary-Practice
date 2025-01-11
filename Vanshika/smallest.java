public class smallest {
    public static void main(String[] args) {
        int [] arr=new int[]{4,2,6,12,17,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("minimum element is: "+min);
    }
}
