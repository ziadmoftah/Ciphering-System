package CipherImplementation;


public class VigenereWithReapeatingKey extends  Vigenere{
    public VigenereWithReapeatingKey(String plainText, String key) {
        super(plainText, key);
        GetNewKey();
    }

    @Override
    public String getKey() {
        return Key ;
    }

    @Override
    public String Encrypt() {
        char encryptedtext[] = new char[PlainText.length()] ;
        for ( int i = 0 ; i < PlainText.length() ; i ++ ){
            encryptedtext[i] = EncryptChar(PlainText.charAt(i) , NewKey.charAt(i)) ;
        }
        EncryptedText = new String(encryptedtext) ;
        return EncryptedText;
    }

    private Boolean IsAlpha(char in){
        return ( in >= 'A' &&  in <= 'Z') || ( in >= 'a' && in <= 'z') ;
    }
    private Boolean IsLowerCase( char in ){
        return in >= 'a' && in <= 'z' ;
    }
    private Boolean IsUpperCase( char in ){
        return in >= 'A' && in <= 'Z' ;
    }
    private char EncryptChar ( char in , char currKey ){
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
    private char DecryptChar ( char in , char currKey ){
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
    @Override
    public String Decrypt() {
        char plaintext[] = new char[EncryptedText.length()] ;
        for ( int i = 0 ; i < PlainText.length() ; i ++ ){
            plaintext[i] = DecryptChar(EncryptedText.charAt(i) , NewKey.charAt(i) ) ;
        }
        PlainText = new String(plaintext) ;
        return PlainText;
    }

    @Override
    String GetNewKey(){
        int count = 0 ;
        char[] newkey = new char[PlainText.length()] ;
        for ( int i = 0 ; i < PlainText.length(); i ++){
            if ( PlainText.charAt(i) == ' ' ){
                newkey[i] = ' ' ;
                continue;
            }
            newkey[i] = Key.charAt((count++)%(Key.length())) ;
        }
        NewKey = new String ( newkey ) ;
        return NewKey ;
    }
}
