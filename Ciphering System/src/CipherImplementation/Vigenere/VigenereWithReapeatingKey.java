package CipherImplementation.Vigenere;

import CipherImplementation.Caeser.Caeser;

public class VigenereWithReapeatingKey extends Vigenere {//Inheritance tree Concept (Level 3)***


    public VigenereWithReapeatingKey(String plainText, String key) {
        super(plainText, key);
        GetNewKey();
    }
    public VigenereWithReapeatingKey(String plainText) {
        super(plainText, null);
        Key = super.GenerateRandomKey()  ;
        GetNewKey() ;
    }


    //Overriding Concept***
    @Override

    public String getKey() {
        return Key ;
    }

    //Overriding Concept***
    @Override
    public String Encrypt() {
        char encryptedtext[] = new char[PlainText.length()] ;
        for ( int i = 0 ; i < PlainText.length() ; i ++ ){
            encryptedtext[i] = Caeser.EncryptChar(PlainText.charAt(i) , NewKey.charAt(i)) ;
        }
        EncryptedText = new String(encryptedtext) ;
        return EncryptedText;
    }

    //Overriding Concept***
    @Override
    public String Decrypt() {
        char plaintext[] = new char[EncryptedText.length()] ;
        for ( int i = 0 ; i < PlainText.length() ; i ++ ){
            plaintext[i] = Caeser.DecryptChar(EncryptedText.charAt(i) , NewKey.charAt(i) ) ;
        }
        PlainText = new String(plaintext) ;
        return PlainText;
    }

    //Overriding Concept***
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
