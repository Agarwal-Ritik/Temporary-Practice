import java.util.Random;

public class randomno {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100); 
        System.out.println("Random Number: " + randomNumber);
    }
}
