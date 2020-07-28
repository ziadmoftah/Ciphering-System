
package CipherImplementation.HillCipher;
import CipherImplementation.HillCipher.*;
class Vector
{
    protected int elements[][];

    public Vector()
    {
        elements = new int[2][1];
    }

    public Vector(int first_element,int second_element)
    {
        elements = new int[2][1];
        elements[0][0] = first_element;
        elements[1][0] = second_element;
    }
}