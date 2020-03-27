package CipherImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PlayFair extends Cipher
{
    ArrayList<pair> arr ;
    private char [][]LetterTable = new char[5][5];
    private char Result_Letter1 , Result_Letter2;
    public PlayFair(String plainText, String key)
    {
        super(plainText,key);
        arr = new ArrayList<pair>();
        plainText = plainText.toLowerCase();
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

    private void FillTable()
    {
        Map<Character, Boolean> letters = new HashMap<Character, Boolean>();
        int counter = 0;
        char initial_letter = 'a';
        for(int i = 0; i <= 4 ; i++)
        {
            for(int j = 0; j <= 4; j++)
            {
                if(counter < Key.length()) {
                    LetterTable[i][j] = Key.charAt(counter);
                    letters.put(Key.charAt(counter),true);
                    counter++;
                }
                else
                {
                    for(int k = 0; k < 26; k++)
                    {
                        if(!letters.containsKey(initial_letter) && initial_letter != 'j')
                        {
                            LetterTable[i][j] = initial_letter;
                            initial_letter++;
                            break;
                        }
                        else
                            initial_letter++;
                    }
                }
            }

        }
    }
    private int Search(pair SearchLetters)
    {
        int index1,index2;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {

            }
        }
        return 0;
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
        this.FillTable();
        return null;
    }




}