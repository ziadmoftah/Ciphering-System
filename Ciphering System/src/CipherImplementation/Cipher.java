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


}
