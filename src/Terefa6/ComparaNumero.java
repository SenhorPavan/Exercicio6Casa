
package Terefa6;

public class ComparaNumero {

    
    public ComparaNumero(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;
        
    }
   
        int num1;
        int num2;
    
        public void ComparaNumero(){
            
            if(num1 == num2){    
                System.out.println("Os numero são iguais");
            }else{
                System.out.println("Os numero são diferentes");
            }
            if(num1>num2){
                System.out.println("O numero "+num1+" é maior que o numero "+num2);
            }else{
                System.out.println("O numero "+num2+" é maior que o numero "+num1);
            }
            
            
            
        }
    
}
