
public class randNum {

    public static int randomNumber(){

        int min = 100000; // Minimum value (inclusive)
        int max = 999999; // Maximum value (inclusive)
        return (int) (Math.random() * (max - min + 1)) + min; // Generate random number
    }
    
}
