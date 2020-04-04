package CipherImplementation.RailFence;

import CipherImplementation.Cipher;

public class Rail_Fence extends Cipher {
    private int FencesNumber ;

    public Rail_Fence(String Plaintext , int key){
        super( Plaintext,  null ) ;
        FencesNumber = key ;
    }

    public  String getKey() {
        return String.valueOf(FencesNumber) ;
    }

    public  String Encrypt() {
        EncryptedText = new String("") ;
        String plain_text= new String( " " + PlainText) ;
        for ( int i = 1 ; i <= FencesNumber ; i ++ ){
            int j = i  ;
            Boolean flag = true ;
            while ( j < plain_text.length() ){
                EncryptedText += plain_text.charAt(j) ;
                if ( i == 1 || i == FencesNumber  ){
                    j += ( FencesNumber - 1 ) * 2 ;
                }
                else {
                    if ( flag ){
                        j += ((FencesNumber - i ) * 2) ;
                        flag = false ;
                    }
                    else if ( !flag){
                        j += ((i-1) * 2) ;
                        flag = true ;
                    }
                }
            }
        }
        return EncryptedText ;
    }


    public  String Decrypt() {

        char[] plain_text = new char[EncryptedText.length()] ;
        String encrypted_text = new String( " " + EncryptedText) ;
        int CurrEncryptedTextIndex = 1 ;
        for ( int i = 1 ; i <= FencesNumber ; i ++ ){
            int j = i  ;
            Boolean flag = true ;
            while ( j < encrypted_text.length() ){
                plain_text[j-1] = encrypted_text.charAt(CurrEncryptedTextIndex) ;
                CurrEncryptedTextIndex ++ ;
                if ( i == 1 || i == FencesNumber  ){
                    j += ( FencesNumber - 1 ) * 2 ;
                }
                else {
                    if ( flag ){
                        j += ((FencesNumber - i ) * 2) ;
                        flag = false ;
                    }
                    else if ( !flag){
                        j += ((i-1) * 2) ;
                        flag = true ;
                    }
                }
            }
        }
        PlainText =new String( plain_text) ;
        return PlainText  ;
    }

    public int getFencesNumber() {
        return FencesNumber;
    }

    public void setFencesNumber(int fencesNumber) {
        FencesNumber = fencesNumber;
    }
}
