package com.gmail;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/Flats?serverTimezone=Europe/Kiev" ;
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
            while (true) {
                System.out.println("1. Добавить квартиру");
                System.out.println("2. Посмотреть квартиры");
                System.out.println("3. Выйти");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addFlat(connection);
                        break;
                    case 2:
                        viewFlats(connection);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Некорректный выбор");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addFlat(Connection connection) throws SQLException {

    }

    private static void viewFlats(Connection connection) throws SQLException {

    }
}
