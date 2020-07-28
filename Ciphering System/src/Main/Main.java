package Main;
import CipherImplementation.Vigenere.Caeser;
import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caeser;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;
import File.FileInputOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VigenereAutoKey v=new VigenereAutoKey("ramyandyousef","key");
        String encText=v.Encrypt();
        System.out.println(encText);
        v=new VigenereAutoKey(encText,"key");
        System.out.println(v.Decrypt2());
      //HillCipher RF = new HillCipher("/Z3L~mo\"x`9ixDu~B]Uu~B" , "n<Z=");
       /* HillCipher RF = new HillCipher("q#>4-q" , "4R\u0012<");
        System.out.println(RF.Decrypt());
        System.out.println(RF.getKey());*/

    }
}
