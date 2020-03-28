package CipherImplementation;


public class Main {
    public static void main(String[] args) {
        VigenereWithReapeatingKey VG= new VigenereWithReapeatingKey("sASKDAMSKHFadsfafdlk"
                , "ahfsdlkasdflk") ;
        System.out.println(VG.Encrypt()) ;
        System.out.println(VG.Decrypt());

    }


}
