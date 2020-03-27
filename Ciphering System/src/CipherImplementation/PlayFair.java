package CipherImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PlayFair extends Cipher
{
    ArrayList<pair> Char_Array ;
    ArrayList<pair> New_Char_Array;
     pair []Char_Index;
    private char [][]LetterTable = new char[5][5];
    private char Result_Letter1 , Result_Letter2;

    public PlayFair(String plainText, String key)
    {
        super(plainText,key);
        Char_Index=new pair[2];
        Char_Array = new ArrayList<pair>();
        New_Char_Array=new ArrayList<pair>();

        this.FillTable();
    }


    void SplitString()
    {
        String NewPlainText= PlainText.replaceAll("\\s+", "");
        NewPlainText=NewPlainText.toLowerCase();
        int index = 0;


        for (int i = 0; i < NewPlainText.length(); i++)
        {
            if((i+1)!=NewPlainText.length())
            {
                if (NewPlainText.charAt(i) == NewPlainText.charAt(i + 1))
                {
                    pair p = new pair(NewPlainText.charAt(i), 'x');
                    Char_Array.add(index, p);
                    index++;

                }
                else {
                    pair p = new pair(NewPlainText.charAt(i), NewPlainText.charAt(i + 1));
                    Char_Array.add(index, p);
                    index++;
                    i++;
                }
            }
            else
            {
                pair p=new pair(NewPlainText.charAt(i),'x');
                Char_Array.add(index, p);
                break;

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
        int Case=0;

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(SearchLetters.char1==LetterTable[i][j])
                {
                    Char_Index[0]=new pair(i,j);
                }
                else if(SearchLetters.char2==LetterTable[i][j])
                {
                    Char_Index[1]=new pair(i,j);
                }

            }
        }

        if(Char_Index[0].i==Char_Index[1].i)
        {
             Case=1;
        }
        else if(Char_Index[0].j==Char_Index[1].j)
        {
            Case=2;
        }
        else
        {
             Case=3;
        }

        return Case ;
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
        int Choice;
        SplitString();
        for(int k=0;k<Char_Array.size();k++)
        {
            Choice=Search(Char_Array.get(k));

            if(Choice==1)
            {
                Result_Letter1=LetterTable[Char_Index[0].i][(Char_Index[0].j+1)%5];
                Result_Letter2=LetterTable[Char_Index[1].i][(Char_Index[1].j+1)%5];

                New_Char_Array.add(k,new pair(Result_Letter1,Result_Letter2));

            }
            else if(Choice==2)
            {
                Result_Letter1=LetterTable[(Char_Index[0].i+1)%5][Char_Index[0].j];
                Result_Letter2=LetterTable[(Char_Index[1].i+1)%5][Char_Index[1].j];

                New_Char_Array.add(k,new pair(Result_Letter1,Result_Letter2));
            }
            else if(Choice==3)
            {
                Result_Letter1=LetterTable[Char_Index[0].i][Char_Index[1].j];
                Result_Letter2=LetterTable[Char_Index[1].i][Char_Index[0].j];

                New_Char_Array.add(k,new pair(Result_Letter1,Result_Letter2));
            }

        }
        char[] a=new char[New_Char_Array.size()*2];

        int c=0;
        for(int j=0;j<a.length;j++)

        {
            if((j+1)!=a.length)
            {
                a[j]=New_Char_Array.get(c).char1;
                a[j+1]=New_Char_Array.get(c).char2;
                j++;
                c++;
            }

        }
        EncryptedText=a.toString();
        return EncryptedText;

    }


    @Override
    String Decrypt ()
    {
        this.FillTable();
        return null;
    }




}