
package proyecto.progra;
import javax.swing.*; 

public class Tipo_Zapato {
    // Variables y arreglos.
    int[] zapatos;  
    private int cantidad; 
    private int deportivo;
    private int casual; 
    private int elegante; 
    private String Nom; 
    private String color; 
    private int talla; 
    private String marca; 
    int var1; 
    
    public Tipo_Zapato()
    {}
    
    public void Tipo_Zapato()
    {
        // Se inicializa las variables.
        cantidad = 0;
        deportivo = 10203; // lineas 19, 20, 21 son los codigos de cada estilo de zapato para evaluar al final. 
        casual = 11302;
        elegante = 12401; 
        Nom = " "; 
        color = " "; 
        talla = 0; 
        marca = " ";
    }
    // Generador de los set y Get.
    public int getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(int deportivo) {
        this.deportivo = deportivo;
    }

    public int getCasual() {
        return casual;
    }

    public void setCasual(int casual) {
        this.casual = casual;
    }

    public int getElegante() {
        return elegante;
    }

    public void setElegante(int elegante) {
        this.elegante = elegante;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    public void zapatodeportivo(){
        // generar una pregunta en esta linea que si desea devolverse al menu inicial o continuar con el proceso de compra.
        
       .getCantidad() = JOptionPane.showInputDialog("Bienvenido " +  + ", por favor digite la cantidad de zapatos deportivos que desea adquirir: "); // Aqui deben generar el obejto para leer la cantidad de zapatos. 
        zapatos = new int[cantidad];
        
        for(var1 = 0; var1 < cantidad; var1++){
            // Se solicita al cliente los datos de los zapatos a adquirir. 
          .getTalla() = JOptionPane.showInputDialog("Ingrese la talla del zapato #" + (var1 + 1)); 
          zapatos[var1] = .setTalla(); // se debe crear el objeto cliente para que funcione.
          .getColor() = JOptionPane.showInputDialog("Ingrese el color que desea para el zapato #" + (var1+1)); 
          zapatos[var1] = .setColor();
          .getMarca() = JOptionPane.showInputDialog("Ingrese la marca del zapato #" + (var1+1) + 
                  "\nDe contamos las siguientes marcas: " + 
                  "\nAdidas. " +
                  "\nNike. " +
                  "\nPuma."); 
          zapatos[var1] = .setMarca();
        }       
    }
public void zapatocasual(){
     // generar una pregunta en esta linea que si desea devolverse al menu inicial o continuar con el proceso de compra.
        
       .getCantidad() = JOptionPane.showInputDialog("Bienvenido " +  + ", por favor digite la cantidad de zapatos de estilo casual que desea adquirir: "); // Aqui deben generar el obejto para leer la cantidad de zapatos. 
        zapatos = new int[cantidad];
        
        for(var1 = 0; var1 < cantidad; var1++){
            // Se solicita al cliente los datos de los zapatos a adquirir. 
          .getTalla() = JOptionPane.showInputDialog("Ingrese la talla del zapato #" + (var1 + 1)); 
          zapatos[var1] = .setTalla(); // se debe crear el objeto cliente para que funcione.
          .getColor() = JOptionPane.showInputDialog("Ingrese el color que desea para el zapato #" + (var1+1)); 
          zapatos[var1] = .setColor();
          .getMarca() = JOptionPane.showInputDialog("Ingrese la marca del zapato #" + (var1+1) + 
                  "\nDe momento contamos con las siguientes marcas: " + 
                  "\nSperry. " +
                  "\nVans. " +
                  "\nTommy."); 
          zapatos[var1] = .setMarca();
}
}
public void zapatoelegnate(){
     // generar una pregunta en esta linea que si desea devolverse al menu inicial o continuar con el proceso de compra.
        
       .getCantidad() = JOptionPane.showInputDialog("Bienvenido " +  + ", por favor digite la cantidad de zapatos de estilo elegante que desea adquirir: "); // Aqui deben generar el obejto para leer la cantidad de zapatos. 
        zapatos = new int[cantidad];
        
        for(var1 = 0; var1 < cantidad; var1++){
            // Se solicita al cliente los datos de los zapatos a adquirir. 
          .getTalla() = JOptionPane.showInputDialog("Ingrese la talla del zapato #" + (var1 + 1)); 
          zapatos[var1] = .setTalla(); // se debe crear el objeto cliente para que funcione.
          .getColor() = JOptionPane.showInputDialog("Ingrese el color que desea para el zapato #" + (var1+1)); 
          zapatos[var1] = .setColor();
          .getMarca() = JOptionPane.showInputDialog("Ingrese la marca del zapato #" + (var1+1) + 
                  "\nDe momento contamos con las siguientes marcas: " + 
                  "\nTommy. " +
                  "\nGucci. " +
                  "\nAdoc."); 
          zapatos[var1] = .setMarca();
}
        
    }

        }
