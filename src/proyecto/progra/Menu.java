
package proyecto.progra;

import javax.swing.JOptionPane;

public class Menu 
{
    public static void Menu()
    {
    int opcion;
    JOptionPane.showMessageDialog(null,"Bienvenido a la tienda ");
     Tipo_Zapato fide = new Tipo_Zapato();   
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(  //opciones del menu
        "1. Estilo de zapato Casual"
     +"\n2. Estilo de zapato Deportivo"
     +"\n3. Estilo de zapato Formal"  
     +"\n4. SALIR"));
     
       switch(opcion)
       { 
           case 1: 
           JOptionPane.showMessageDialog(null,"Estos son los estilos Casuales"); 
          fide.zapatocasual();
       
       break;//llamamos los metodos en el mejor orden
       
        case 2:
            JOptionPane.showMessageDialog(null,"Estos son los estilos Deportivos");
             fide.zapatodeportivo();
               
       break;
       
        case 3:
       JOptionPane.showMessageDialog(null,"Estos son los estilo Formales.");
       fide.zapatoelegnate();
       
       break;
       
       case 4:
       JOptionPane.showMessageDialog(null,"Gracias por visitarnos, "
               + "y recuerde zapateria la confiable donde encuentra todo a buen precio");
       break;
      
        default: JOptionPane.showMessageDialog(null,"porfavor ingrese una opcion valida para el sistema");
        break;     
       } 
    }
}
