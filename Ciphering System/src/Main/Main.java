package Main;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caesar;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;

public class Main {

    public static void main(String[] args) {

        Rail_Fence RF = new Rail_Fence("We are discovered" , 2) ;
        System.out.println(RF.Encrypt());
        System.out.println(RF.Decrypt());


    }
}
