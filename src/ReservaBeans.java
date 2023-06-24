
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ReservaBeans {
    int reserva_id;
    int funcion_id;
    int cliente_id;
    int cantidad_tickets;
    accesobd bd;
    
    public ReservaBeans() throws Exception {
        bd = new accesobd("localhost", "root", "Fernanflo23", "cines");
        bd.conectarbd();

    }

    public int getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(int reserva_id) {
        this.reserva_id = reserva_id;
    }

    public int getFuncion_id() {
        return funcion_id;
    }

    public void setFuncion_id(int funcion_id) {
        this.funcion_id = funcion_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getCantidad_tickets() {
        return cantidad_tickets;
    }

    public void setCantidad_tickets(int cantidad_tickets) {
        this.cantidad_tickets = cantidad_tickets;
    }
    
    public int incremento() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = bd.consultabd("SELECT max(reserva_id) as num FROM reservas r;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }
    
    public void insertar_reserva() throws Exception {

        String cadena = "insert into reservas values('" + getReserva_id()+ "','" + getFuncion_id()+ "','" + getCliente_id()+ "','" + getCantidad_tickets()+ "')";
        bd.actualizabd(cadena);
    }

    public ResultSet consultarTabla(String sql) throws SQLException {

        return bd.consultabd(sql);

    }
    
    public void eliminar_reserva() throws Exception{
         String cadena ="DELETE FROM reservas WHERE id='"+getReserva_id()+"'";
        bd.actualizabd(cadena);
        
    }
    
    public void actulizar_reserva() throws Exception{
        String cadena ="UPDATE reservas set reserva_id='"+getReserva_id()+"', funcion_id='"+getFuncion_id()+"', cliente_id='"+getCliente_id()+"', cantidad_tickets='"+getCantidad_tickets()+"' WHERE id='"+getReserva_id()+"'";

    
}
}
