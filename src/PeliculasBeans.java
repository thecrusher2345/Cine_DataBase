/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeliculasBeans {

    private int pelicula_id;
    String titulo;
    String genero;
    String duracion;
    String clasificacion;
    accesobd bd;

    public PeliculasBeans() throws Exception {
        bd = new accesobd("localhost", "root", "Fernanflo23", "cines");
        bd.conectarbd();

    }

    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int incremento() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = bd.consultabd("SELECT max(pelicula_id) as num FROM peliculas p;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void insertar_pelicula() throws Exception {

        String cadena = "insert into peliculas values('" + getPelicula_id()+ "','" + getTitulo() + "','" + getGenero() + "','" + getDuracion() + "','" + getClasificacion() + "')";
        bd.actualizabd(cadena);
    }

    public ResultSet consultarTabla(String sql) throws SQLException {

        return bd.consultabd(sql);

    }
    
    public void eliminar_pelicula() throws Exception{
         String cadena ="DELETE FROM peliculas WHERE id='"+getPelicula_id()+"'";
        bd.actualizabd(cadena);
        
    }
    
    public void actulizar_pelicula() throws Exception{
        String cadena ="UPDATE peliculas set id='"+getPelicula_id()+"', nombre='"+getTitulo()+"', apellido='"+getGenero()+"', email='"+getDuracion()+"', telefono='"+getClasificacion()+"' WHERE id='"+getPelicula_id()+"'";
        bd.actualizabd(cadena);
        
    }
    
}
