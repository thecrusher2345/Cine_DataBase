/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */

//sdfsdf

import java.sql.*;
public class ClienteBeans {
    //vamos a llamar cada clse para cada consulta para la interfaz grafica del usuario
    private int Id_Cliente;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Telefono;
    accesobd bd;

    public ClienteBeans() throws Exception {
        bd= new accesobd("localhost", "root", "Fernanflo23", "cines");
        bd.conectarbd();
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }
    
    

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefono() {
        return Telefono;
    }
    
    
//    public int incremento()throws SQLException{
//        int inc=0;
//        ResultSet rs;
//        rs=bd.consultabd("SELECT max(id) as num FROM clientes c;");
//        if (rs.next()){
//            inc=rs.getInt(1)+1;get
//        }else {
//            inc=1;
//        }
//        return inc;
//    }
    
    public void insertar_cliente()throws Exception{

            String cadena ="insert into clientes values('"+ getId_Cliente() +"','"+ getNombre()+"','"+ getApellido()+"','"+ getEmail()+"','"+ getTelefono()+"')";
            bd.actualizabd(cadena);  
    }
    
    public void actulizar_cliente() throws Exception{
        String cadena ="UPDATE clientes set cliente_id='"+getId_Cliente()+"', nombre='"+getNombre()+"', apellido='"+getApellido()+"', email='"+getEmail()+"', telefono='"+getTelefono()+"' WHERE cliente_id='"+getId_Cliente()+"'";
        bd.actualizabd(cadena);
        
    }
    
    public void eliminar_cliente() throws Exception{
         String cadena ="DELETE FROM clientes WHERE cliente_id='"+getId_Cliente()+"';";
        bd.actualizabd(cadena);
    }
    public ResultSet consultarTabla(String sql) throws SQLException{

        return bd.consultabd(sql);
        
    }
    
    public void consultar_cliente() throws Exception{
        ResultSet rs;
        rs=bd.consultabd("SELECT * FROM clientes c");
        while (rs.next()) {            
            System.out.print(rs.getInt(1)+" | ");
            System.out.print(rs.getString(2)+" | ");
            System.out.print(rs.getString(3)+" | ");
            System.out.print(rs.getString(4)+" | ");
            System.out.print(rs.getString(5)+" | ");
            System.out.println("");
        }
        
    }

    
    
}
