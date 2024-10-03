/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.AgregarMecanico;
import vista.AgregaMecanico;

/**
 *
 * @author Mateo
 */
public class ctrlMecanico  implements MouseListener{
        //1-Mandar a llamar a las otras capas
    private AgregarMecanico modelo;
    private AgregaMecanico vista;
 
 
       //2- crear el constructor 
    public ctrlMecanico(AgregarMecanico modelo, AgregaMecanico vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar25.addMouseListener(this);
        modelo.Mostrar(vista.jtMecanico);
        vista.btnActualizar.addMouseListener(this);
        vista.jtMecanico.addMouseListener(this);
        vista.btnEliminar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnAgregar25){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso25.getText()));
            modelo.setCorreo(vista.txtCorreo25.getText());

            
            modelo.GuardarCo();
            modelo.Mostrar(vista.jtMecanico);
        }
        
        if(e.getSource() == vista.btnEliminar){
            modelo.Eliminar(vista.jtMecanico);
            modelo.Mostrar(vista.jtMecanico);
        }
        
        if(e.getSource() == vista.jtMecanico){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso25.getText()));
            modelo.setCorreo(vista.txtCorreo25.getText());

            
           modelo.Actualizar(vista.jtMecanico);
            modelo.Mostrar(vista.jtMecanico);
        }
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

