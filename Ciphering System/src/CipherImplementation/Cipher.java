package CipherImplementation;

public abstract class Cipher {
    protected String PlainText, EncryptedText, Key ;


    public Cipher(String plainText, String key) {
        PlainText = plainText;
        Key = key;
    }

    public abstract String getKey() ;
    public abstract String Encrypt() ;
    public abstract String Decrypt() ;

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
                int x = (in + Character.toLowerCase(currKey)) % 26 ;
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
}
