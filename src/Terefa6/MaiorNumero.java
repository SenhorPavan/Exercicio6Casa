
package Terefa6;



public class MaiorNumero {
    
    public MaiorNumero(int num1, int num2){
        
        this.num1 = num1;
        this.num2 = num2;

    }
   
    int num1;
    int num2;

    public void ImprimaMaior(){
        
        if(num1>num2){
            System.out.println("O numero maior é " + num1);
        }else{
            System.out.println("O numero maior é " + num2);
        }
        
    }
        



    
}
