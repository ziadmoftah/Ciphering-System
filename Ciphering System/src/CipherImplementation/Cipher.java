package CipherImplementation;

import java.util.Random;

public abstract class Cipher {
    protected String PlainText, EncryptedText, Key ;


    public Cipher( String plainText, String key) {
        PlainText = plainText;
        Key = key;

    }
    protected String GenerateRandomKey(){
        char GeneratedKey[] = new char[PlainText.length()] ;
        Random Rd = new Random() ;
        for ( int i = 0 ; i < PlainText.length() ; i ++ ){
            int randomInt = Rd.nextInt(26)  ;
            GeneratedKey[i] = (char)(randomInt+'A') ;  ;
        }
        return String.valueOf(GeneratedKey) ;
    }

    public abstract String getKey() ;
    public abstract String Encrypt() ;
    public abstract String Decrypt() ;



}
