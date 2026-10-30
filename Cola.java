/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

/**
 *
 * @author Estudiante
 */
public class Cola {
    static String[]banco=new String[5];
    static int frenteBanco=0;
    static int cantidadBanco=0;
    
    public static boolean isEmpty(){
    if(cantidadBanco==0){
    return true;
    }
    return false;
    }
    public static String peek(){
        if (isEmpty()){
        System.out.println("La cola esta vacia");
        }
        return banco[frenteBanco];
 
    
    }
    
    public static void main(String[] args) {

        
        for(int i=0;i<banco.length;i++){
        banco[i]="persona "+(i+1);
        cantidadBanco++;
        }
        String frente=peek();
        System.out.println("Frente: "+frente);

                while(cantidadBanco>0){
                String nombre=banco[frenteBanco];
                frenteBanco++;
                cantidadBanco--;
                System.out.println("Atendiendo: "+nombre+" quedan "+cantidadBanco+" personas esperando");
                
                }
    }
    
}
