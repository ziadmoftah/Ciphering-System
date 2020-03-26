package CipherImplementation;

import java.util.ArrayList;

class PlayFair extends Cipher
{
    ArrayList<pair> arr ;

    public PlayFair(String plainText, String encryptedText, String key)
    {
        super(plainText,key);
        arr = new ArrayList<pair>();
    }


    void SplitString()
    {
        String NewPlainText= PlainText.replaceAll("\\s+", "");
        int index = 0;


        for (int i = 0; i < NewPlainText.length(); i++) {
            if (NewPlainText.charAt(i) == NewPlainText.charAt(i + 1)   ) {
                pair p = new pair(NewPlainText.charAt(i), 'x');
                arr.add(index, p);
                index++;

            } else {
                pair p = new pair(NewPlainText.charAt(i), NewPlainText.charAt(i + 1));
                arr.add(index, p);
                index++;
                i++;
            }

        }
    }


    @Override
    String getKey ()
    {
        String lol ="haha";
        return lol;
    }

    @Override
    String Encrypt ()
    {
        SplitString();

        return null;

    }


    @Override
    String Decrypt ()
    {
        return null;
    }




}