package CipherImplementation;


public class Main {
    public static void main(String[] args) {
        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("MICHIGAN TECHNOLOGICAL UNIVERSITY"
                , "HOUGHTON") ;
        System.out.println(VG.Encrypt()) ;
        System.out.println(VG.Decrypt());

    }


}
