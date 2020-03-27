package CipherImplementation;

public abstract class Cipher {
    protected String PlainText, EncryptedText, Key ;


    public Cipher(String plainText, String key) {
        PlainText = plainText;
        Key = key;
        Key = Key.toLowerCase();
    }

    abstract String getKey() ;
    abstract String Encrypt() ;
    abstract String Decrypt() ;


}
