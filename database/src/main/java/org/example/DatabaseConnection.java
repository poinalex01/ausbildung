package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseConnection {

    static void main() {
        String url = "jdbc:mariadb://192.168.234.233:3306/alex";
        String user = "alex";
        String password = "aaaAAA123+++";


        ResultSet resultSet;
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected successfully!");
/*
            Statement statement = conn.createStatement();
            String selectSql = "SELECT * " +
                    "FROM bewertung " +
                    "INNER JOIN kunde " +
                    "ON bewertung.kunde_id = kunde.kunde_id";
            resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()){
                String firstname = resultSet.getString("vorname");
                String lastname = resultSet.getString("nachname");
                String email = resultSet.getString("email");
                String registrierDatum = resultSet.getString("registriert_am");

                String stars = resultSet.getString("sterne");
                String comment = resultSet.getString("kommentar");
                Date date = resultSet.getDate("datum");

                System.out.println("firstname = " + firstname);
                System.out.println("lastname = " + lastname);
                System.out.println("email = " + email);
                System.out.println("registrierDatum = " + registrierDatum);
                System.out.println("stars = " + stars);
                System.out.println("comment = " + comment);
                System.out.println("date = " + date);
            }

            System.out.println("-".repeat(64));
 */

            String selectSql = "SELECT * FROM v_bewertung_kunde";
            resultSet = conn.createStatement().executeQuery(selectSql);
            while (resultSet.next()) {
                String sterne = resultSet.getString("sterne");
                String kommentar = resultSet.getString("kommentar");
                String datum = resultSet.getString("datum");
                String kundenVorname = resultSet.getString("kVorname");
                String kundenNachname = resultSet.getString("kNachname");
                String cafeName = resultSet.getString("cName");

                System.out.println("sterne = " + sterne);
                System.out.println("kommentar = " + kommentar);
                System.out.println("datum = " + datum);
                System.out.println("kundenVorname = " + kundenVorname);
                System.out.println("kundenNachname = " + kundenNachname);
                System.out.println("cafeName = " + cafeName);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
