
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ModeloContactos {
    
    ArrayList MiLista = new ArrayList();
    DefaultTableModel ModeloTabla;
    
    public void IngresarDatos (String ape, String nom, String tel)
    {
        Contactos nuevoContacto = new Contactos(ape, nom, tel);
        this.MiLista.add(nuevoContacto);
        
    }
    public DefaultTableModel ListaContactos()
    {
        ArrayList<Contactos>listaLocal = MiLista;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        for(Contactos MiListaContactos: listaLocal)
        {
            this.ModeloTabla.addRow(new Object []{MiListaContactos.getApellidos(),
               MiListaContactos.getNombre(),MiListaContactos.getTelefono()});
        }
        return ModeloTabla;
    }   
}
