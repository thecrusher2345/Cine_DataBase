/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.sql.*;
public class SalaBeans {
    private int sala_id;
    private String nombre;
    private String capacidad;
    accesobd bd;
    
    public SalaBeans() throws Exception {
        bd= new accesobd("localhost", "root", "Fernanflo23", "cines");
        bd.conectarbd();
    }

    public int getSala_id() {
        return sala_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    public int incremento()throws SQLException{
        int inc=0;
        ResultSet rs;
        rs=bd.consultabd("SELECT max(sala_id) as num FROM salas s;");
        if (rs.next()){
            inc=rs.getInt(1)+1;
        }else {
            inc=1;
        }
        return inc;
    }
    
    public void insertar_salas()throws Exception{

            String cadena ="insert into salas values('"+incremento()+"','"+ getNombre()+"','"+ getCapacidad()+"')";
            bd.actualizabd(cadena);  
    }
    
    public void actulizar_salas() throws Exception{
        String cadena ="UPDATE salas set id='"+getSala_id()+"', nombre='"+getNombre()+"', capacidad='"+getCapacidad()+"' WHERE id='"+getSala_id()+"'";
        bd.actualizabd(cadena);
    }
    
    public void eliminar_salas(){
        
    }
    public ResultSet consultarTabla(String sql) throws SQLException{

        return bd.consultabd(sql);
        
    }
    
 
}