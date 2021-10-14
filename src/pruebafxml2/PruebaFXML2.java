package pruebafxml2;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pruebafxml2.model.Contacto;

public class PruebaFXML2 extends Application {
    private Stage stage;
    private BorderPane raizPrincipal;
    private ObservableList<Contacto> datosP = FXCollections.observableArrayList();
    
    public PruebaFXML2(){
        datosP.add(new Contacto("Jose", "Tupayachi"));
        datosP.add(new Contacto("Eduardo", "Huaman"));
        datosP.add(new Contacto("Mirtha", "Yupanqui"));
    }
    
    public ObservableList<Contacto> getContactos(){
        return datosP;
    }
    
    @Override
    public void start(Stage stage){
        this.stage=stage;
        this.stage.setTitle("Contactos");
        MenuInicio();
        DatosPersona();
    }
    
    public void MenuInicio(){
        try{           
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(PruebaFXML2.class.getResource("view/MenuPrincipal.fxml"));
            raizPrincipal = (BorderPane) loader.load();
            
            Scene scene = new Scene(raizPrincipal);
            stage.setScene(scene);
            stage.show();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }    
    }

    public void DatosPersona(){
        try{
            FXMLLoader cargaDatos = new FXMLLoader();
            cargaDatos.setLocation(PruebaFXML2.class.getResource("view/FXMLDocument.fxml"));
            
            AnchorPane BPersona = (AnchorPane)cargaDatos.load();
            
            raizPrincipal.setCenter(BPersona);
            
            FXMLDocumentController controlador = cargaDatos.getController();
            controlador.setPruebaFXML2(this);
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }      
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

