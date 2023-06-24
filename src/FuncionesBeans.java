/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.sql.*;
public class FuncionesBeans {
    int funcion_id;
    int pelicula_id;
    int sala_id;
    String fecha_hora;
    accesobd bd;
    
    public FuncionesBeans() throws Exception {
        bd= new accesobd("localhost", "root", "Fernanflo23", "cines");
        bd.conectarbd();
    }

    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public void setSala_id(int sala_id) {
        this.sala_id = sala_id;
    }
    

    public int getSala_id() {
        return sala_id;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }
    
      public int incremento()throws SQLException{
        int inc=0;
        ResultSet rs;
        rs=bd.consultabd("SELECT max(funcion_id) as num FROM funciones f;");
        if (rs.next()){
            inc=rs.getInt(1)+1;
        }else {
            inc = 1;
        }
        return inc;
    }



     
    public void insertar_funcion()throws Exception{

            String cadena ="insert into funciones values('"+ getFuncion_id()+"','"+ getPelicula_id()+"','"+ getSala_id()+"','"+ getFecha_hora()+"')";
            bd.actualizabd(cadena);  
    }
    
    public void actulizar_funcion() throws Exception{
        String cadena ="UPDATE funciones set funcion_id='"+getPelicula_id()+"', pelicula_id='"+getSala_id()+"', sala_id='"+getSala_id()+"', fecha_hora='"+getFecha_hora()+"'";
        bd.actualizabd(cadena);
        
    }
    
    public void eliminar_funcion() throws Exception{
         String cadena ="DELETE FROM funciones WHERE id='"+getFuncion_id()+"'";
        bd.actualizabd(cadena);
    }
    public ResultSet consultarTabla(String sql) throws SQLException{

        return bd.consultabd(sql);
        
    }

    
      

    
    


    
    
    
    
}
