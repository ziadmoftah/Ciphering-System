/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CipherImplementation;

import java.util.*;
public class Caesar extends Cipher {

    private char key;
    private Boolean IsAlpha(char in){
        return ( in >= 'A' &&  in <= 'Z') || ( in >= 'a' && in <= 'z') ;
    }
    private Boolean IsLowerCase( char in ){
        return in >= 'a' && in <= 'z' ;
    }
    private Boolean IsUpperCase( char in ){
        return in >= 'A' && in <= 'Z' ;
    }

    public Caesar(String plain_text) {
        
        super( plain_text , null );
        Random Generator = new Random();
        int x = Generator.nextInt(26);
        this.key = (char)(x + 'a');
    }

    public Caesar(String plain_text , String keyy) {

         super( plain_text , null );
         Random Generator = new Random();
         int x = Generator.nextInt(26);
         this.key = keyy.charAt(0);
         super.Key = Character.toString(this.key);
    }

    public String Encrypt (){

        String enc = "";
        for (int i=0; i <  super.PlainText.length(); i++)
        {
            enc += EncryptChar(super.PlainText.charAt(i),this.key);
        }
        super.EncryptedText = enc;
        return super.EncryptedText;
    }

    public String Decrypt () {

        String dec = "";
        for (int i=0; i < super.EncryptedText.length(); i++)
        {
            dec += DecryptChar(super.EncryptedText.charAt(i),this.key);
        }
        return dec;
    }

    public String getKey() {

        return Integer.toString(this.key);
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

}
