package CipherImplementation;

import java.lang.reflect.GenericArrayType;
import java.util.Random;

abstract class Vigenere extends Cipher {
    protected String NewKey ;
    public Vigenere(String plainText, String key) {
        super(plainText,  key);
    }
    public abstract String getKey() ;
    public abstract String Encrypt() ;
    public abstract String Decrypt() ;
    abstract String GetNewKey() ;
    private Boolean IsAlpha(char in){
        return ( in >= 'A' &&  in <= 'Z') || ( in >= 'a' && in <= 'z') ;
    }
    private Boolean IsLowerCase( char in ){
        return in >= 'a' && in <= 'z' ;
    }
    private Boolean IsUpperCase( char in ){
        return in >= 'A' && in <= 'Z' ;
    }
    protected char EncryptChar ( char in , char currKey ){
        if ( IsAlpha(in)){
            if ( IsLowerCase(in)){
                int x = (in + Character.toLowerCase(currKey)-64) % 26 ;
                x += 'a' ;
                return (char)(x) ;
            }
            else if ( IsUpperCase(in)){
                int x = (in + Character.toUpperCase(currKey)) % 26 ;
                x += 'A' ;
                return (char)(x) ;
            }
        }
        else {
            return in ;
        }
        return 0 ;
    }
    protected char DecryptChar ( char in , char currKey ){
        if ( IsAlpha(in)){
            if ( IsLowerCase(in)){
                int x = (in - Character.toLowerCase(currKey)+26) % 26 ;
                x += 'a' ;
                return (char)(x) ;
            }
            else if ( IsUpperCase(in)){
                int x = (in - Character.toUpperCase(currKey)+26) % 26 ;
                x += 'A' ;
                return (char)(x) ;
            }
        }
        else {
            return in ;
        }
        return 0 ;
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
}
