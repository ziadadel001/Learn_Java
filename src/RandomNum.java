import java.util.Random;

public class RandomNum {

    public  static void run(){
    Random random = new Random();

    int number;

    number = random.nextInt(1,10); // random numbers between 1 to 9

    System.out.println(number);
}}
