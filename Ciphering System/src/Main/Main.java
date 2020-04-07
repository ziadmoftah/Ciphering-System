package Main;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caesar;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;

public class Main {

    public static void main(String[] args) {

        PlayFair RF = new PlayFair("We are discovered" , "haha");
        System.out.println(RF.Encrypt());
        System.out.println(RF.Decrypt());


    }
}
