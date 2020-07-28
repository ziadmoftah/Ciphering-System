
package CipherImplementation.HillCipher;
import CipherImplementation.HillCipher.*;

import java.util.Random;
class Key
{
    protected int elements[][];
    protected int elements_Inverted[][];
    protected int det;
    protected int det_mod_inverse;
    protected final int NumOfChars;

    public Key()
    {

        elements = new int[2][2];
        elements_Inverted = new int[2][2];
        NumOfChars = 95;

    }

    protected boolean Have_mod_inv()
    {


        for(int i=0;i<NumOfChars;i++){

            if((det * i)% NumOfChars == 1)
            {
                det_mod_inverse = i;
                return true;
            }
        }
        return false;
    }

    protected void create(String keyy){


        elements[0][0] = keyy.charAt(0)-32;
        elements[0][1] = keyy.charAt(1)-32;
        elements[1][0] = keyy.charAt(2)-32;
        elements[1][1] = keyy.charAt(3)-32;


        det = elements[0][0] * elements[1][1] - elements[0][1] * elements[1][0];

        if (!(det != 0 && Have_mod_inv()))
            Generate();
        else {


            elements_Inverted[0][0] = (elements[1][1] * det_mod_inverse) % NumOfChars;
            elements_Inverted[1][1] = (elements[0][0] * det_mod_inverse) % NumOfChars;
            elements_Inverted[0][1] = ((-1*elements[0][1] + NumOfChars) * det_mod_inverse) % NumOfChars;
            elements_Inverted[1][0] = ((-1*elements[1][0] + NumOfChars) * det_mod_inverse) % NumOfChars;

        }
    }



    protected void Generate()
    {
        Random randint = new Random();
        while(true)
        {
            while(true)
            {
                elements[0][0] = randint.nextInt(95);
                if(elements[0][0] != 0)
                    break;
            }

            while(true)
            {
                elements[0][1] = randint.nextInt(95);
                if(elements[0][1] != 0)
                    break;
            }

            while(true)
            {
                elements[1][0] = randint.nextInt(95);
                if(elements[1][0] != 0)
                    break;
            }

            while(true)
            {
                elements[1][1] = randint.nextInt(95);
                if(elements[1][1] != 0)
                    break;
            }

            det = elements[0][0] * elements[1][1] - elements[0][1] * elements[1][0];

            if(det != 0 && Have_mod_inv())
                break;
        }

        elements_Inverted[0][0] = (elements[1][1] * det_mod_inverse) % NumOfChars;
        elements_Inverted[1][1] = (elements[0][0] * det_mod_inverse) % NumOfChars;
        elements_Inverted[0][1] = ((-1*elements[0][1] + NumOfChars) * det_mod_inverse) % NumOfChars;
        elements_Inverted[1][0] = ((-1*elements[1][0] + NumOfChars) * det_mod_inverse) % NumOfChars;

    }

    public Vector Key_Times_Vector(Vector vec)
    {
        Vector tmp = new Vector();
        tmp.elements[0][0] = elements[0][0] * vec.elements[0][0] + elements[0][1] * vec.elements[1][0];
        tmp.elements[1][0] = elements[1][0] * vec.elements[0][0] + elements[1][1] * vec.elements[1][0];
        tmp.elements[0][0] %= NumOfChars;
        tmp.elements[1][0] %= NumOfChars;
        return tmp;
    }

    public Vector KeyInverse_Times_Vector(Vector vec)
    {
        Vector tmp = new Vector();
        tmp.elements[0][0] = elements_Inverted[0][0] * vec.elements[0][0] + elements_Inverted[0][1] * vec.elements[1][0];
        tmp.elements[1][0] = elements_Inverted[1][0] * vec.elements[0][0] + elements_Inverted[1][1] * vec.elements[1][0];
        tmp.elements[0][0] %= NumOfChars;
        tmp.elements[1][0] %= NumOfChars;
        return tmp;
    }

}