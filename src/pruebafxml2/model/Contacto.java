
package pruebafxml2.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Contacto {
    private final StringProperty Nombres;
    private final StringProperty Apellidos;
    private final StringProperty Direccion;
    private final IntegerProperty NroCel;

    public Contacto(String Nombres, String Apellidos) {
        this.Nombres = new SimpleStringProperty(Nombres);
        this.Apellidos = new SimpleStringProperty(Apellidos);
        this.Direccion = new SimpleStringProperty("Av Cultura s/n");
        this.NroCel = new SimpleIntegerProperty(984562574);
    }

   public Contacto(){
       this(null,null);
   }
   
//**********************
   public String getNombres() {
        return Nombres.get();
    }
            
   public void setNombres(String Nombre){
       this.Nombres.set(Nombre);
   }
            
   public StringProperty NombresProperty(){
       return Nombres;
   }
   
//************************
   public String getApellidos() {
       return Apellidos.get();
   }
   
   public void setApellidos(String Apellido){
       this.Apellidos.set(Apellido);
   }
   
   public StringProperty ApellidosProperty() {
            return Apellidos;
    }

//***********************   
    public String getDireccion() {
       return Direccion.get();
   }
   
   public void setDireccion(String direccion){
       this.Direccion.set(direccion);
   }
    
   public StringProperty DireccionProperty() {
        return Direccion;
   }

//***********************
    public int getNroCel() {
       return NroCel.get();
   }
   
   public void setNroCel(int nroCel){
       this.NroCel.set(nroCel);
   }
   
   public IntegerProperty NroCelProperty() {
        return NroCel;
   }
}
