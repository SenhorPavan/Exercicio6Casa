package maior.numero;

import java.time.LocalDateTime;


public class Pessoa {

    private String nome;
    private int anoNasc;
    private double altura;

    public String getNome() {

        return this.nome;

    }
    public int getanoNasc(){
        
        return this.anoNasc;
        
    }
    public double getAltura(){
        
        return this.altura;
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }

    public void setanoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void Imprimir(){
        
        System.out.println("Nome: "+this.nome);
        System.out.println("Altura: "+this.altura);
        System.out.println("Ano Nascimento: "+this.anoNasc);
        
    }
    
    public void Idade(){
        
        System.out.println(LocalDateTime.now().getYear() - this.anoNasc);
        System.out.println(LocalDateTime.now().getDayOfWeek());
    }
    
}
