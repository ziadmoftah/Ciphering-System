package CipherImplementation;


public class Main {
    public static void main(String[] args) {
        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("A"
                , "B") ;
        System.out.println(VG.Encrypt()) ;
        System.out.println(VG.Decrypt());

    }


}
