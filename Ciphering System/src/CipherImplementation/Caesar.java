/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CipherImplementation;

import java.util.*;
public class Caesar extends Cipher {
    
    
    private int key;
    private final int char_num;
    private Dictionary get_num;
    private Dictionary get_char;

    public Caesar(String plain_text , String key) {
        
        super( plain_text , key );
        this.get_num  = new Hashtable();
        this.get_char = new Hashtable();
        this.char_num = 95;
        this.key = (Integer.parseInt(key) % this.char_num );
        for(int i = 0 ; i < this.char_num ; i++)
        {
            get_char.put( i , (char)(i+32) );
            get_num.put ( (char)(i+32) , i );
        }  
    }
    
    public Caesar(String plain_text) {
        
        super( plain_text , null);
        this.get_num  = new Hashtable();
        this.get_char = new Hashtable();
        this.char_num = 95;
        Random Generator = new Random();
        this.key = Generator.nextInt(this.char_num);
        for(int i = 0 ; i < this.char_num ; i++)
        {
            get_char.put( i , (char)(i+32) );
            get_num.put ( (char)(i+32) , i );
        }  
    }
    
    
    public String getKey() {
        
        return Integer.toString(this.key);
    }

    
    public String Encrypt (){
       
     String enc = ""; 
     for (int i=0; i <  super.PlainText.length(); i++) 
        { 
            int x = (int)this.get_num.get(super.PlainText.charAt(i));
            int y = (( x + this.key)  % this.char_num );
            enc += (this.get_char.get(y));           
        }   
        super.EncryptedText = enc;
        return enc;
    }  
   
    public String Decrypt () {
       
        
        String dec = "";
        for (int i=0; i < super.EncryptedText.length(); i++) 
        {
            int x = (int)this.get_num.get( super.EncryptedText.charAt(i));
            int y = ((( x - this.key)  + this.char_num) % this.char_num) ; 
            dec += (this.get_char.get(y));     
        }   
         return dec;
    }  
}
