/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uef.edu.vn.beautysalonfuwa.config;
import java.sql.Connection;
/**
 *
 * @author PC
 */
public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Ket noi database thanh cong!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}