package CipherImplementation.Vigenere;

import CipherImplementation.Cipher;

import java.lang.reflect.GenericArrayType;
import java.util.Random;

abstract class Vigenere extends Cipher {
    protected String NewKey ;
    public Vigenere(String plainText, String key) {
        super(plainText,  key);
    }
    public abstract String getKey ();
    public abstract String Encrypt();
    public abstract String Decrypt();
    abstract String GetNewKey() ;

}
