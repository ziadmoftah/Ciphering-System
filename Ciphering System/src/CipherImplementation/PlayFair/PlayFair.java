package CipherImplementation.PlayFair;

import CipherImplementation.Cipher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PlayFair extends Cipher
{
    private ArrayList<pair> Char_Array = new ArrayList<pair>();
    private ArrayList<pair> New_Char_Array =new ArrayList<pair>();
    private pair []Char_Index=new pair[2];;
    private char [][]LetterTable = new char[9][9];
    private char Result_Letter1 , Result_Letter2;

    public PlayFair(String plainText, String key)
    {
        super(plainText,key);
        this.FillTable();
    }

    public PlayFair(String plainText)
    {
        super(plainText, null);
        this.Key = GenerateRandomKey();
        this.FillTable();
    }

    void SplitString()
    {
        String NewPlainText= PlainText;
        int index = 0;


        for (int i = 0; i < NewPlainText.length(); i++)
        {
            if((i+1)!=NewPlainText.length())
            {
                if (NewPlainText.charAt(i) == NewPlainText.charAt(i + 1))
                {
                    pair p = new pair(NewPlainText.charAt(i), 'X');
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
                pair p=new pair(NewPlainText.charAt(i),'X');
                Char_Array.add(index, p);
                break;

            }

        }
    }

    private void FillTable()
    {
        Map<Character, Boolean> letters = new HashMap<Character, Boolean>();
        int counter = 0;
        char initial_letter = '.';
        for(int i = 0; i <= 8 ; i++)
        {
            for(int j = 0; j <= 8; j++)
            {
                if(i == 8 && j == 8)
                {
                    if(!letters.containsKey(' '))
                    {
                        LetterTable[8][8] = ' ';
                        break;
                    }
                }
                if(counter < Key.length()) {
                    if(!letters.containsKey(Key.charAt(counter))) {
                        LetterTable[i][j] = Key.charAt(counter);
                        letters.put(Key.charAt(counter), true);
                    }
                    else
                    {
                        j--;
                    }
                    counter++;

                }
                else
                {
                    for(int k = 0; k < 81; k++)
                    {
                        if(!letters.containsKey(initial_letter))
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

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
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
    public String getKey ()
    {
        return Key;
    }

    @Override
    public String Encrypt ()
    {
        int Choice;
        SplitString();
        for(int k=0;k<Char_Array.size();k++)
        {
            Choice=Search(Char_Array.get(k));

            if(Choice==1)
            {
                Result_Letter1=LetterTable[Char_Index[0].i][(Char_Index[0].j+1)%9];
                Result_Letter2=LetterTable[Char_Index[1].i][(Char_Index[1].j+1)%9];

                New_Char_Array.add(k,new pair(Result_Letter1,Result_Letter2));

            }
            else if(Choice==2)
            {
                Result_Letter1=LetterTable[(Char_Index[0].i+1)%9][Char_Index[0].j];
                Result_Letter2=LetterTable[(Char_Index[1].i+1)%9][Char_Index[1].j];

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

        int c = 0;
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
        EncryptedText=new String(a);
        return EncryptedText;

    }


    @Override
    public String Decrypt ()
    {
        int Choice;
        int l = 0,index1,index2;
        Char_Array.clear();
        New_Char_Array.clear();
        for(int i = 0; i < (EncryptedText.length() / 2); i++)
        {
            Char_Array.add(i,new pair(EncryptedText.charAt(l),EncryptedText.charAt(l+1)));
            l += 2;

        }
        for(int k=0;k<Char_Array.size();k++)
        {
            Choice=Search(Char_Array.get(k));

            if(Choice==1)
            {
                index1 = Char_Index[0].j - 1;
                index2 = Char_Index[1].j - 1;

                if(index1 == -1)
                    index1 = 8;
                if(index2 == -1)
                    index2 = 8;

                Result_Letter1 = LetterTable[Char_Index[0].i][index1];
                Result_Letter2 = LetterTable[Char_Index[1].i][index2];

                New_Char_Array.add(k,new pair(Result_Letter1,Result_Letter2));

            }
            else if(Choice==2)
            {
                index1 = Char_Index[0].i - 1;
                index2 = Char_Index[1].i - 1;

                if(index1 == -1)
                    index1 = 8;
                if(index2 == -1)
                    index2 = 8;
                Result_Letter1=LetterTable[index1][Char_Index[0].j];
                Result_Letter2=LetterTable[index2][Char_Index[1].j];

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
        PlainText = new String(a);
        return PlainText;
    }

}