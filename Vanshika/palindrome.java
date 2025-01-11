import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(ispalindrome(num)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();

        }
        public static boolean ispalindrome(int number){
            int original=number;
            int reverse=0;
            while(number>0){
             int remainder=number%10;
             reverse=reverse*10+remainder;
             number/=10;
            }
            return original==reverse;
        }

    }
