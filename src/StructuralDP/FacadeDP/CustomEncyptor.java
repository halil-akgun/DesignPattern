package StructuralDP.FacadeDP;

public class CustomEncyptor {
    public static void main(String[] args) {

        String text = "GUL";

        // kotu dizayn
        AESEnc aesEnc = new AESEnc();
        aesEnc.encrypt(text);

        MD5Enc md5Enc = new MD5Enc();
        md5Enc.encrypt(text, "key");

        SHAEnc shaEnc = new SHAEnc();
        shaEnc.encrypt(text, "key", true);


        // iyi dizayn
        System.out.println("*******************");
        EncFacade encFacade = new EncFacade();
        encFacade.encrypt("GUL", EncFacade.EncType.AES);

    }
}
