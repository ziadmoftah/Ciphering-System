package Main;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caesar;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;
import File.FileInputOutput;

public class Main {

    public static void main(String[] args) {

        FileInputOutput.SaveToFile("zz" , "hhhh") ;
        String in = FileInputOutput.LoadFromFile("zz") ;
        System.out.print(in);
    }
}
