package com.filtrojava.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String URL = "jdbc:mysql://root:AaPbgWrzdKmovNJkECuhDGADYkSpUXPF@monorail.proxy.rlwy.net:13750/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "AaPbgWrzdKmovNJkECuhDGADYkSpUXPF";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
