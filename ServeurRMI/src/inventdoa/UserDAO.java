package inventdoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcon.DBConnection;


public class UserDAO {
    private Connection connection;
    public UserDAO() throws SQLException{
        connection = DBConnection.getConnection();
        
    }
    
    // create User
    public int insertUser(User user){
        try{
            String sql = "INSERT INTO test (nom, categorie, quantite, prix) VALUES(?,?,?,?)";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, user.getNom());
            stmt.setString(2, user.getCategorie());
            stmt.setString(3, user.getQuantite());
            stmt.setString(4, user.getPrix());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
    
    // Select/read Users
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM test";
            PreparedStatement stmt =connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String cat = rs.getString("categorie");
                String quant = rs.getString("quantite");
                String prix = rs.getString("prix");
                
                users.add(new User(id, nom, cat, quant, prix));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    
    // update User
    public int updateUser(User user){
        try{
            String sql = "UPDATE test SET nom=?, categorie=?, quantite=?, prix=? WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, user.getNom());
            stmt.setString(2, user.getCategorie());
            stmt.setString(3, user.getQuantite());
            stmt.setString(4, user.getPrix());
            stmt.setInt(5, user.getId());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
   
    
    // Delete User
    public void deleteUser(int id){
        try{
            String sql = "DELETE FROM test  WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        }catch(SQLException e){
              e.printStackTrace();
        }
        
    }
    //recherche
    // Select/read Users
    /*public List<User> getUsers1(){
        List<User> users = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM test where id=3";
            PreparedStatement stmt =connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String cat = rs.getString("categorie");
                String quant = rs.getString("quantite");
                String prix = rs.getString("prix");
                
                users.add(new User(id, nom, cat, quant, prix));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return users;
    }
    

    

   */ 
    
    
}
