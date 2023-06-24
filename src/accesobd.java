/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.sql.*;

public class accesobd {

    private final String Host;
    private final String user;
    private final String password;
    private final String bd;

    /*apara abrir o cerrar la conexion*/
    private Connection conexion;

    public accesobd(String Host, String user, String password, String bd) {
        this.Host = Host;
        this.user = user;
        this.password = password;
        this.bd = bd;
    }

    public String getHost() {
        return Host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getBd() {
        return bd;
    }

    public void conectarbd()throws Exception {
        try {
            Driver driver = (Driver)// definir el driver a utilizar en este caso sql
                    Class.forName("com.mysql.jdbc.Driver").newInstance(); //instanciamos el driver dentro de la clase
            DriverManager.registerDriver(driver);//registramos el driver
            //esto se aplica para cualquier base de datos ya junto con el diver y haciendo los pasos anteriores seria todo
            String cadena = "jdbc:mysql://" + getHost() + "/" + getBd();
            conexion = DriverManager.getConnection(cadena, getUser(), getPassword());
            System.out.println("Coneccion exitosa a la base de datos");
        } catch (Exception e) {//solo se puede trabajar con los errores Exceptio pero no con los de mysql en conectar la base de datos
            System.out.println("Error de conexion a la base de datos" + e.toString());
        }

    }

    public void actualizabd(String sql)throws Exception {
        try {
            //con esto creamos la conexcion o el camino haci la base de datos
            Statement stm=conexion.createStatement();
            //en si sirver para las transacciones o procesos de la app hacia la base de datos
            stm.executeUpdate(sql);
            System.out.println("Transaccion exitosa!....");
        } catch (Exception e) {
            System.out.println("Error en la Transaccion" + e.toString());
        }

    }

    public ResultSet consultabd(String sql) throws SQLException {
        ResultSet cursor;
        Statement stm =conexion.createStatement();
        cursor=stm.executeQuery(sql);
        return cursor;
    }

    public void cerrarbd()throws SQLException{
        conexion.close();

    }
    
    
    
}
