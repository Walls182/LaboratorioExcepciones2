/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioexcepciones2;

import javax.swing.JOptionPane;

/**
 *
 * @author Walls
 */
public class LaboratorioExcepciones2   {

    public static void main(String[] args) throws NumberMuchoException {
        try {
            
            int a = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a dividir"));
            //Lanzamos nuestra propia excepcion;
            rango(a,b);
            metodoDivide(a, b);
            
        } catch (ArithmeticException e) {
          
              System.out.println("No se puede dividir por cero " + e);
        }catch (NumberFormatException e){
        
             System.out.println("Debe digitar un numero " + e);
        
        }catch(NumberMuchoException e){
        
            System.out.println("Error "+ e
            );
        }
        

    }
    //Aca creamos el metodo que lanza la excepcion
    
    
    public static void rango(int num,int num1)throws NumberMuchoException{
    if (num>10||num1>10) {
                throw new NumberMuchoException("El numero tiene un parametro muy alto");
            }

}
    public static void metodoDivide(int a, int b) throws NumberMuchoException {
        int resultado;
       

            resultado = a / b;
        System.out.println(resultado);
     

    }

    
}
