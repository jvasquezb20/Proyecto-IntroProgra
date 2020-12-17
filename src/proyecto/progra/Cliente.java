package proyecto.progra;

import javax.swing.JOptionPane;

public class Cliente 
{
    private int x;
    private String cedula;
    private String nombre;
    private String apellidos;
    private String email;
    
 public Cliente()
 {
 }
    
 public Cliente(String nombre,String apellidos,String cedula,String email)         
 {
 this.nombre = nombre;
 this.apellidos = apellidos;
 this.cedula = cedula;
 this.email = email;
 }
 
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void datos()
    {
     Cliente arreglo[] = new Cliente[x];
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes que va a ingresar"));
        for (int x=0; x<arreglo.length;x++)
    {
    JOptionPane.showMessageDialog(null,"se le solicita los datos del Empleado"
     +x);
    int edad=Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad"));   
    String nombre=JOptionPane.showInputDialog("Escriba el nombre");
    String apellidos=JOptionPane.showInputDialog("Escriba los apellidos");   
    double salario= Double.parseDouble(JOptionPane.showInputDialog("Escriba el salario"));
    }
        
        
    for (int x=0;x<arreglo.length;x++)
    {
        JOptionPane.showMessageDialog(null,"Cliente: "+arreglo[x].nombre
        +" "+arreglo[x].apellidos+"cedula: "+arreglo[x].cedula+""+arreglo[x].email);
    }
    }
}
