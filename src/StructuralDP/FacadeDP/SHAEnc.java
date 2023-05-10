package StructuralDP.FacadeDP;

public class SHAEnc {
    public void encrypt(String text, String key, boolean type) {
        if (type) System.out.println("SHA: " + text + key);
        else System.out.println("SHA: " + key + text);
    }
}
