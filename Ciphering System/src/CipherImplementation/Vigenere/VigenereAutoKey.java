package CipherImplementation.Vigenere;


import java.util.Random;

public class VigenereAutoKey extends Vigenere {//Inheritance tree Concept (Level 3)***


    public VigenereAutoKey(String plainText, String key) {
        super(plainText, key);
    }
    public VigenereAutoKey(String plainText){
        super(plainText, null);
        Key=GenerateRandomKey();
    }
    @Override
    String GetNewKey() {
        //Overriding Concept***
        String temp=Key;
        for(int i=0;i<PlainText.length();++i)
        {
            char c=PlainText.charAt(i);
            if(Character.isAlphabetic(c))
            {
                temp+=c;
            }
        }

        temp=temp.toLowerCase();
        return temp;
    }

    @Override
    protected String GenerateRandomKey() {
        char GeneratedKey[] = new char[PlainText.length()/2] ;
        Random Rd = new Random() ;
        for ( int i = 0 ; i < PlainText.length()/2 ; i ++ ){
            int randomInt = Rd.nextInt(26)  ;
            GeneratedKey[i] = (char)(randomInt+'A') ;  ;
        }
        return String.valueOf(GeneratedKey) ;
    }
    //Overriding Concept***
    @Override
    public String getKey() {
        return Key;
    }

    //Overriding Concept***
    @Override
    public String Encrypt() {
        char[] encryptedData;
        char[] key;
        int k=0;


        Key=GetNewKey();

        encryptedData=new char[PlainText.length()];
        key=Key.toCharArray();

        for(int i=0;i<PlainText.length();++i)
        {
            k%=key.length;
            char tmp=PlainText.charAt(i);
            if(Character.isAlphabetic(tmp))
            {
                tmp = Caeser.EncryptChar(tmp,Character.toUpperCase(key[k]));
                k++;
            }
            encryptedData[i]=tmp;
        }
        String temp="";
        for(int i=0;i<encryptedData.length;++i)
        {
            temp+=encryptedData[i];
        }
        EncryptedText=temp;
        return temp;
    }

    //Overriding Concept***
    @Override
    public String Decrypt() {
        int k=0;
        char[] key=Key.toCharArray();
        char[] decryptedData=new char[EncryptedText.length()];
        for(int i=0;i<EncryptedText.length();++i)
        {
            char tmp=EncryptedText.charAt(i);
            if(Character.isAlphabetic(tmp))
            {
                k%=key.length;
                tmp= Caeser.DecryptChar(tmp,key[k]);
                k++;
            }
            decryptedData[i]=tmp;
        }
        String temp="";
        for(int i=0;i<decryptedData.length;++i)
        {
            temp+=decryptedData[i];
        }
        return temp;
    }
    public String Decrypt2() {
        char[] newKey=new char[Key.length()+PlainText.length()+1];
        char[] DecryptedText=new char[PlainText.length()+1];
        for(int i=0;i<Key.length();++i)
        {
            newKey[i]=Key.charAt(i);
        }
        int addIdx=Key.length();
        int keyIdx=0;
        for(int i=0;i<PlainText.length();++i)
        {
            char tempChar=PlainText.charAt(i);
            if(Character.isAlphabetic(tempChar))
            {
                char shiftChar = Character.toLowerCase(newKey[keyIdx]);
                keyIdx++;
                int shift=shiftChar-'a';
                tempChar=Caeser.DecryptChar(tempChar,shiftChar);
                newKey[addIdx]=tempChar;
                addIdx++;
            }
            DecryptedText[i]=tempChar;
        }
        System.out.println("In The Fun\nNew Key: "+newKey+"\nKey : "+Key);
        String output="";
        for(int i=0;i<PlainText.length();++i)
        {
            output=output+DecryptedText[i];
        }
        return output;
    }
}
/*
key     :qwe
new key :qweeabcde
text    :abcde
res     :zxcvb

key    :qwe
new key:qweabcd
text   :zxcvb
res    :abcd
 */