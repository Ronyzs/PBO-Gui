/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ronyzs
 */
public class ConnectDB {

    private static Connection koneksi;

    public static Connection konfig() throws ClassNotFoundException {
        String user = "root";
        String pass = "";
        String host = "localhost";
        String db = "db_mahasiswa";

        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://" + host + "/" + db + "?&user=" + user + "&password=" + pass;
                koneksi = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println("Koneksi gagal" + e.getMessage());
            }
        }
        return koneksi;
    }
}
