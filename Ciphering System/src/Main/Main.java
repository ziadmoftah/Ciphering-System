package Main;
import CipherImplementation.Vigenere.Caeser;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caeser;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;
import File.FileInputOutput;

public class Main {

    public static void main(String[] args) {

        HillCipher RF = new HillCipher("/Z3L~mo\"x`9ixDu~B]Uu~B" , "n<Z=");
        System.out.println(RF.Decrypt());
        System.out.println(RF.getKey());

    }
}
