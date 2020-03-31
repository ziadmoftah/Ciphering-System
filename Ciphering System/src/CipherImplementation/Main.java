package CipherImplementation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("Hezllo") ;
        System.out.println(VG.getKey()) ;
        System.out.println(VG.Encrypt()) ;
        System.out.println(VG.Decrypt());

        VigenereAutoKey v=new VigenereAutoKey("INKNA?dkldk  dsklhjssa" );
        System.out.println(v.Encrypt());
        System.out.println(v.Decrypt());
    }


}
