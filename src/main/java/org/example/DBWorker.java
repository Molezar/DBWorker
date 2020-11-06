package org.example;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.*;

public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    private Connection connection;

    public DBWorker() {
        try {
            //Driver driver = new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            System.err.println("error");
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
