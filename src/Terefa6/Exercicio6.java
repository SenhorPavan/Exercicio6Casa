package Terefa6;

public class Exercicio6 {

    public static void main(String[] args) {

        MaiorNumero n1 = new MaiorNumero(54, 53);
        n1.ImprimaMaior();

        System.out.println("");

        NumeroDecrescente n2 = new NumeroDecrescente(69);
        n2.NumeroDecrescente();

        System.out.println("");

        ComparaNumero n3 = new ComparaNumero(50, 540);
        n3.ComparaNumero();
        
        System.out.println("");

        Pessoa n4 = new Pessoa();
        n4.setNome("Geraldo");
        n4.setAltura(1.87);
        n4.setanoNasc(2003);
        
        n4.Imprimir();
        n4.Idade();
    }

}
