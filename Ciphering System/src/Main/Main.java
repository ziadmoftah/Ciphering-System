package Main;
import CipherImplementation.Caeser.Caeser;

public class Main {

    public static void main(String[] args) {

        Caeser RF = new Caeser("We are discovered" , "h");
        System.out.println(RF.Encrypt());
        System.out.println(RF.Decrypt());
        System.out.println(RF.getKey());


    }
}
