package org.example;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        DBWorker worker = new DBWorker();

        String query = "select * from users";

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));

                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));


                System.out.println(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
