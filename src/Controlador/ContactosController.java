
package Controlador;

import Modelos.ModeloContactos;
import Vistas.frmAgrContactos;
import Vistas.frmListContactos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ContactosController implements ActionListener{
    frmPrincipal VistaPrincipal;
    frmListContactos VistaListaContactos;
    frmAgrContactos VistaAgrContactos;
    ModeloContactos ContactosModelo;
    
    public ContactosController (frmPrincipal VistaPrincipal, frmListContactos VistaListaContactos, 
            frmAgrContactos VistaAgrContactos, ModeloContactos ContactosModelo){
        
        this.VistaPrincipal = VistaPrincipal;
        this.VistaAgrContactos = VistaAgrContactos;
        this.VistaListaContactos = VistaListaContactos;
        this.ContactosModelo = ContactosModelo;
        
        this.VistaPrincipal.btnAgregarContacto.addActionListener(this);
        this.VistaPrincipal.btnVerContactos.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        
    }
    

    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VistaAgrContactos.btnAgregarCon )
        {
            this.ContactosModelo.IngresarDatos(this.VistaAgrContactos.txtApe.getText(),
            this.VistaAgrContactos.txtNom.getText(),this.VistaAgrContactos.txtTel.getText());
            
            this.VistaAgrContactos.txtNom.setText("");
            this.VistaAgrContactos.txtApe.setText("");
            this.VistaAgrContactos.txtTel.setText("");   
        }
        

        
        if(e.getSource() == VistaPrincipal.btnVerContactos)
        {
            this.VistaListaContactos.TablaContactos.setModel(this.ContactosModelo.ListaContactos());
            this.VistaListaContactos.setLocationRelativeTo(null);
            this.VistaListaContactos.setVisible(true);
            
        }
                if(e.getSource() == VistaPrincipal.btnAgregarContacto)
        {
            this.VistaAgrContactos.btnAgregarCon.addActionListener(this);
            this.VistaAgrContactos.btnCancelar.addActionListener(this);
            
            this.VistaAgrContactos.setLocationRelativeTo(VistaPrincipal);
            this.VistaAgrContactos.setVisible(true);
          
        }
        if(e.getSource()== VistaAgrContactos.btnCancelar)
        {
            this.VistaAgrContactos.txtNom.setText("");
            this.VistaAgrContactos.txtApe.setText("");
            this.VistaAgrContactos.txtTel.setText(""); 
            
        }
    }
    
    
}
