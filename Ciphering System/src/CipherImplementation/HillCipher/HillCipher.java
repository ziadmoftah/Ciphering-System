package CipherImplementation.HillCipher;

import CipherImplementation.Cipher;
import CipherImplementation.HillCipher.*;

import java.util.*;

public class HillCipher extends Cipher
{

    protected boolean text_even;
    protected final int NumOfChars = 95;
    protected Key Hill_Key;
    protected Dictionary chars;
    protected Dictionary Numbers;

    public HillCipher(String plaintext , String keyy)
    {
        super( plaintext , null);
        Hill_Key = new Key();
        Hill_Key.create(keyy);
        chars = new Hashtable();
        Numbers = new Hashtable();
        char ASCII;
        for(int i=0;i<95;i++)
        {
            ASCII = (char)(i+32);
            chars.put(i, ASCII);
            Numbers.put(ASCII,i);
        }
    }

    public HillCipher(String plaintext)
    {
        super( plaintext , null);
        Hill_Key = new Key();
        Hill_Key.Generate();
        chars = new Hashtable();
        Numbers = new Hashtable();
        char ASCII;
        for(int i=0;i<95;i++)
        {
            ASCII = (char)(i+32);
            chars.put(i, ASCII);
            Numbers.put(ASCII,i);
        }
    }

    public String getKey(){

        String K  = "";
        for (int i = 0 ; i < 2 ; i ++){
            for (int j = 0 ; j < 2 ; j++){
                K += (char)(Hill_Key.elements[i][j]+32);
            }
        }
        return K;
    }
    public String Encrypt()
    {
        String temp = "";
        if(super.PlainText.length() % 2 == 0)
            text_even = true;
        else
        {
            text_even = false;
            super.PlainText += ' ';
        }
        for(int i=0;i<super.PlainText.length() - 1;i+=2)
        {
            Vector tmp = new Vector((int)Numbers.get(super.PlainText.charAt(i)),(int)Numbers.get(super.PlainText.charAt(i+1)));
            Vector Encrypted = new Vector();
            Encrypted = Hill_Key.Key_Times_Vector(tmp);
            temp += chars.get(Encrypted.elements[0][0]);
            temp += chars.get(Encrypted.elements[1][0]);
        }

        super.EncryptedText = temp;
        return temp;
    }

    public String Decrypt()
    {
        String temp = "";
        for(int i=0;i<super.EncryptedText.length() - 1;i+=2)
        {
            Vector tmp = new Vector((int)Numbers.get(super.EncryptedText.charAt(i)),(int)Numbers.get(super.EncryptedText.charAt(i+1)));
            Vector Decrypted = new Vector();
            Decrypted = Hill_Key.KeyInverse_Times_Vector(tmp);
            temp += chars.get(Decrypted.elements[0][0]);
            temp += chars.get(Decrypted.elements[1][0]);
        }
        return temp;
    }

}
