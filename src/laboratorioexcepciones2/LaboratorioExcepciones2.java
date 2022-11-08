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

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a dividir"));
            metodoDivide(a, b);
            
        } catch (ArithmeticException e) {
          
              System.out.println("No se puede dividir por cero o como puse la excepcion en el metodoDivide no puede ser mayor a 10  " + e);
        }catch (NumberFormatException e){
        
             System.out.println("Debe digitar un numero " + e);
        
        }

    }

    public static void metodoDivide(int a, int b) throws NumberFormatException {
        int resultado;
        if (b>10) {
             throw new NumberFormatException();
        }

            resultado = a / b;
        System.out.println(resultado);
     

    }

    
}
