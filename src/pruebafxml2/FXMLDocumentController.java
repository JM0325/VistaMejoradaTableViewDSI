
package pruebafxml2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pruebafxml2.model.Contacto;


public class FXMLDocumentController implements Initializable {
    private PruebaFXML2 Prueba2;
            
    @FXML
    private TableView<Contacto> TContactos;

    @FXML
    private TableColumn<Contacto, String> TNombreC;

    @FXML
    private TableColumn<Contacto, String> TApellidoC;

    @FXML
    private Label Contactos;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblApellidos;

    @FXML
    private Label lblDireccion;

    @FXML
    private Label lblNroCelular;

    @FXML
    private Button btnNuevo;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    public FXMLDocumentController() {
    
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TNombreC.setCellValueFactory(cellData -> cellData.getValue().NombresProperty());
        TApellidoC.setCellValueFactory(cellData -> cellData.getValue().ApellidosProperty());
        
        //DetalleContactos(null);
        TContactos.getSelectionModel().selectedItemProperty().addListener((observable, ov, nv) -> DetalleContactos(nv));
    }
    
    public void setPruebaFXML2(PruebaFXML2 prueba2){
        this.Prueba2 = prueba2;
        TContactos.setItems(prueba2.getContactos());
    }
    
    private void DetalleContactos(Contacto persona){
        if (persona != null){
            lblNombre.setText(persona.getNombres());
            lblApellidos.setText(persona.getApellidos());
            lblDireccion.setText(persona.getDireccion());
            lblNroCelular.setText(Integer.toString(persona.getNroCel()));        
        }else{
            lblNombre.setText("");
            lblApellidos.setText("");
            lblDireccion.setText("");
            lblNroCelular.setText("");
        }
    }
}
