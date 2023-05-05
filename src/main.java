
import Controlador.ContactosController;
import Modelos.ModeloContactos;
import Vistas.frmAgrContactos;
import Vistas.frmListContactos;
import Vistas.frmPrincipal;

public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal ();
        frmListContactos VistaListContactos = new frmListContactos(null, true );
        frmAgrContactos VistaAgregarContactos = new frmAgrContactos(null, true);
        ModeloContactos ContactosModelo = new ModeloContactos ();
        ContactosController ControlContactos = new ContactosController (VistaPrincipal, 
        VistaListContactos, VistaAgregarContactos,ContactosModelo );
        
        
        
    }
    
}
