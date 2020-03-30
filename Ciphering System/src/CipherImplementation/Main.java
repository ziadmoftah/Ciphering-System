package CipherImplementation;


public class Main {
    public static void main(String[] args) {

        PlayFair obj = new PlayFair("Omar", "Key");
        System.out.println(obj.Encrypt());
        System.out.println(obj.Decrypt());
    }


}
