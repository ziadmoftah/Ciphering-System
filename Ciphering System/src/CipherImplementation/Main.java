package CipherImplementation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("He ?zllo") ;
        System.out.println(VG.getKey()) ;
        System.out.println(VG.Encrypt()) ;
        System.out.println(VG.Decrypt());

        Scanner s=new Scanner(System.in);
        VigenereAutoKey v=new VigenereAutoKey(s.nextLine(),s.nextLine());
        System.out.println(v.Encrypt());
        System.out.println(v.Decrypt());
    }


}
