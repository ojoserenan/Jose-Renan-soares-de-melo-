package reinoanimal;
public class Teste {
    public static void main(String args[]){
    Cachorro cachorro = new Cachorro("Adao", "pastor-alemao");
    Macaco macaco = new Macaco("marcos","prego");
    Aguia aguia = new Aguia("zeca","urubu");
    Passaro passaro = new Passaro("piu-piu","canario");
    System.out.println(cachorro.getDescricao());
    System.out.println(cachorro);
    System.out.println(macaco.getDescricao());
    System.out.println(macaco);
    System.out.println(aguia.getDescricao());
    System.out.println(aguia);
    System.out.println(passaro.getDescricao());
    System.out.println(passaro);
}
}
