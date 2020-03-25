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
        return null;
    }

    @Override
    public String Decrypt() {
        return null;
    }

    @Override
    String GetNewKey(){
        int SpacesCount_In_PlainText = 0;
        for ( int i = 0 ; i < PlainText.length() ; i ++){
            if ( PlainText.charAt(i) == ' '){
                SpacesCount_In_PlainText ++  ;
            }
        }
        char[] newkey = new char[PlainText.length()-SpacesCount_In_PlainText] ;
        for ( int i = 0 ; i < PlainText.length()-SpacesCount_In_PlainText; i ++){
            newkey[i] = Key.charAt(i%(Key.length())) ;
        }
        NewKey = new String ( newkey ) ;
        return NewKey ;
    }
}
