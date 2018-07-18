/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongpmse.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import truongpmse.connection.GetConnection;
import truongpmse.dtos.SateDTO;

/**
 *
 * @author Duong
 */
public class SateDAO implements Serializable {

    Connection conn = null;
    PreparedStatement preStm = null;
    ResultSet rs = null;

    private void closeConnection() throws ClassNotFoundException, SQLException, Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public ArrayList<SateDTO> getSateList() throws ClassNotFoundException, SQLException, Exception {
        ArrayList<SateDTO> result = null;

        try {
            String sql = "SELECT SatelliteId, SatelliteName, Location, Description, Status, TimeOfUpdate FROM tbl_Satellite";
            conn = GetConnection.getConnection();
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("SatelliteId");
                String name = rs.getString("SatelliteName");
                String location = rs.getString("Location");
                String description = rs.getString("Description");
                boolean status = rs.getBoolean("Status");
                String realStatus;
                if (status) {
                    realStatus = "Available";
                } else {
                    realStatus = "Disable";
                }
                String time = rs.getString("TimeOfUpdate");
                result.add(new SateDTO(id, name, location, description, realStatus, time));
            }
        } finally {
            closeConnection();
        }

        return result;
    }

    public SateDTO getDetail(String dtoid) throws Exception {
        SateDTO result = null;
        try {
            String sql = "SELECT SatelliteName, Location, Description, Status, TimeOfUpdate FROM tbl_Satellite where  SatelliteId = '" + dtoid + "'";
            conn = GetConnection.getConnection();
            preStm = conn.prepareStatement(sql);
            rs = preStm.executeQuery();
            result = new SateDTO();
            while (rs.next()) {
                String name = rs.getString("SatelliteName");
                String location = rs.getString("Location");
                String description = rs.getString("Description");
                boolean status = rs.getBoolean("Status");
                String realStatus;
                if (status) {
                    realStatus = "Available";
                } else {
                    realStatus = "Disable";
                }
                String time = rs.getString("TimeOfUpdate");
                result = new SateDTO(dtoid, name, location, description, realStatus, time);
            }
        } finally {
            closeConnection();
        }

        return result;
    }
//    
//    public SateDTO getBook(String bookId) throws ClassNotFoundException, SQLException, Exception {
//        SateDTO result = null;
//        
//        try {
//            String sql = "SELECT bookId, bookTitle, description, author, publisher, price FROM tbl_Book WHERE bookId = ?";
//            conn = GetConnection.getConnection();
//            preStm = conn.prepareStatement(sql);
//            preStm.setString(1, bookId);
//            rs = preStm.executeQuery();
//            if (rs.next()) {
//                String bookTitle = rs.getString("bookTitle");
//                String description = rs.getString("description");
//                String author = rs.getString("author");
//                String publisher = rs.getString("publisher");
//                float price = rs.getFloat("price");
//                result = new SateDTO(bookId, bookTitle, description, author, publisher, price);
//            }
//        } finally {
//            closeConnection();
//        }
//        
//        return result;
//    }
//    
//    public boolean deleteBook(String bookId) throws ClassNotFoundException, SQLException, Exception {
//        boolean result = false;
//        
//        try {
//            String sql = "DELETE FROM tbl_Book WHERE bookId = ?";
//            conn = GetConnection.getConnection();
//            preStm = conn.prepareStatement(sql);
//            preStm.setString(1, bookId);
//            result = preStm.executeUpdate() == 1;
//        } finally {
//            closeConnection();
//        }
//        
//        return result;
//    }
//    
//    public boolean editBook(String bookId, String bookTitle, String description, String author, String publisher, float price) throws ClassNotFoundException, SQLException, Exception {
//        boolean result = false;
//        
//        try {
//            String sql = "UPDATE tbl_Book SET bookTitle = ?, description = ?, author = ?, publisher = ?, price = ? WHERE bookId = ?";
//            conn = GetConnection.getConnection();
//            preStm = conn.prepareStatement(sql);
//            preStm.setString(1, bookTitle);
//            preStm.setString(2, description);
//            preStm.setString(3, author);
//            preStm.setString(4, publisher);
//            preStm.setFloat(5, price);
//            preStm.setString(6, bookId);
//            result = preStm.executeUpdate() == 1;
//        } finally {
//            closeConnection();
//        }
//        
//        return result;
//    }
//    
//    public boolean createBook(String bookId, String bookTitle, String description, String author, String publisher, float price) throws ClassNotFoundException, SQLException, Exception {
//        boolean success = false;
//        
//        try {
//            String sql = "INSERT INTO tbl_Book (bookId, bookTitle, description, author, publisher, price) VALUES (?, ?, ?, ?, ?, ?)";
//            conn = GetConnection.getConnection();
//            preStm = conn.prepareStatement(sql);
//            preStm.setString(1, bookId);
//            preStm.setString(2, bookTitle);
//            preStm.setString(3, description);
//            preStm.setString(4, author);
//            preStm.setString(5, publisher);
//            preStm.setString(6, String.valueOf(price));
//            
//            success = preStm.executeUpdate() == 1;            
//        } finally {
//            closeConnection();
//        }    
//        
//        return success;     
//    }
}
