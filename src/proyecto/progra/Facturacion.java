
package proyecto.progra;

import javax.swing.JOptionPane;

public class Facturacion 
{
    Tipo_Zapato fide2 = new Tipo_Zapato();
   
    public void Facturacion()
    {
    JOptionPane.showMessageDialog(null,"Su compra fue de lo siguiente:");
    
    JOptionPane.showMessageDialog(null,"Cantidad: "+fide2.getCantidad()
            +"Marca: "+fide2.getMarca()
            +"talla: "+fide2.getTalla());
           
    JOptionPane.showMessageDialog(null,"Gracias por su compra y su confianza en nosotros");
    }
}
