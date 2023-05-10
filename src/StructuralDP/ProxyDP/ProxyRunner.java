package StructuralDP.ProxyDP;

public class ProxyRunner {
    public static void main(String[] args) {

        ProxyClass proxyClass1 = new ProxyClass("GUL");
        ProxyClass proxyClass2 = new ProxyClass("ROSE");

        proxyClass1.showImage();
        proxyClass2.showImage();
    }
}
