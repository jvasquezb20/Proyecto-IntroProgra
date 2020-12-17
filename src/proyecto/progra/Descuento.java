
package proyecto.progra;

import javax.swing.JOptionPane;


public class Descuento {
    
    
    int factura1;
    int factura2;
    double num1;
    double num2;
    double descu1=0.35;
    double descu2=0.25;
   int tipo;
   int metodopago;
   
   //*****Descuento******
   
   //cambiar el descuento al deseado en la operacion 
   
 
   public void AplicarDescuento(int cantidad, int deportivo, int casual, int elegante){
    //menu para aplicar el metodo de pagoo    
        metodopago= Integer.parseInt(JOptionPane.showInputDialog  ( "Introduzca el metodo de pago deseado: n/"
                                                        + "1.***Tarjeta***"
                                                        + "2.***Efectivo***"));
        
        
        tipo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo de zapato:"
               + "1=casual"
               + "2=deportivo"
               + "3=elegante"));
       switch(metodopago)
       {
           case 1:
               if(tipo==1){
                  num1=cantidad*11302;
                  num2=num1*0.25/100;
                  JOptionPane.showMessageDialog(null, "*****FACTURA*****"
                          + "gracias por su compra,su factura es de" + num2 
                           + "se le realizo un descuento de 0.35");
                  
               }else if(tipo==2){
                  num1=cantidad*10203;
                 num2=num1*0.25/100;
                 
                 JOptionPane.showMessageDialog(null, "*****FACTURA*****"
                          + "gracias por su compra,su factura es de" + num2 
                           + "se le realizo un descuento de 0.35");
                  
               }else 
                  num1=cantidad*12401;
                   num2=num1*0.25/100;
                   
                 JOptionPane.showMessageDialog(null, "*****FACTURA*****"
                          + "gracias por su compra,su factura es de" + num2 
                           + "se le realizo un descuento de 0.35");  
               
               
               
               break;
           case 2:
                if(tipo==1){
                  num1=cantidad*11302;
                  num2=num1*0.35/100;
                  JOptionPane.showMessageDialog(null,"*****FACTURA*****"
                          + "gracias por su compra,su factura es de" + num2 
                           + "se le realizo un descuento de 0.35");
                  
               }else if(tipo==2){
                  num1=cantidad*10203;
                 num2=num1*0.35/100;
                 
                 JOptionPane.showMessageDialog(null,"*****FACTURA*****"
                          + "gracias por su compra,su factura es de" + num2 
                           + "se le realizo un descuento de 0.35");
                  
               }else 
                  num1=cantidad*12401;
                   num2=num1*0.35/100;
                   
               JOptionPane.showMessageDialog(null,"\"*****FACTURA*****\"\n" +
"                          + \"gracias por su compra,su factura es de\" + num2 \n" +
"                           + \"se le realizo un descuento de 0.35\"");
               
               break;
             
               
       }       
   //regalias 
       int opcion;
   opcion= Integer.parseInt(JOptionPane.showInputDialog  ( "eliga un numero entre 0 y 10"));
                                                        
   
   if (opcion>=5){
        JOptionPane.showMessageDialog(null,"*****GANASTE UN CUPON EN TU SIGUIENTE COMPRA********");
        
    }else if (opcion<=10){
        JOptionPane.showMessageDialog(null,"****GANASTE UNA DESCUENTO DE 10% EN LA SIGUIENTE COMPRA QUE REALICES UN PAGO CON TRAJETA*********** ");
    }
        
    }
        
  
}
