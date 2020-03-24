package CipherImplementation;

public abstract class Cipher {
    protected String PlainText, EncryptedText, Key ;


    public Cipher(String plainText, String encryptedText, String key) {
        PlainText = plainText;
        EncryptedText = encryptedText;
        Key = key;
    }

    abstract void getKey() ;
    abstract String Encrypt() ;
    abstract String Decrypt() ;


}
