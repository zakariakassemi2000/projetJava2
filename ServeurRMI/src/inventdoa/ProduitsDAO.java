package inventdoa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcon.DBConnection;


public class ProduitsDAO {
    private Connection connection;
    public ProduitsDAO() throws SQLException{
        connection = DBConnection.getConnection();
        
    }
    
    // create User
    public int insertProduits(Produits produits){
        try{
            String sql = "INSERT INTO test (nom, categorie, quantite, prix) VALUES(?,?,?,?)";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, produits.getNom());
            stmt.setString(2, produits.getCategorie());
            stmt.setString(3, produits.getQuantite());
            stmt.setString(4, produits.getPrix());
            stmt.executeUpdate();
            return 1;
            
        }catch(SQLException e){
              return 0;
        }
        
    }
    
    // Select/read Users
    public List<Produits> getUsers(){
        List<Produits> produits = new ArrayList<>();
        
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
                
                produits.add(new Produits(id, nom, cat, quant, prix));
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return produits;
    }
    
    // update User
    public int updateUser(Produits produits){
        try{
            String sql = "UPDATE test SET nom=?, categorie=?, quantite=?, prix=? WHERE id=?";
            PreparedStatement stmt =connection.prepareStatement(sql);
            stmt.setString(1, produits.getNom());
            stmt.setString(2, produits.getCategorie());
            stmt.setString(3, produits.getQuantite());
            stmt.setString(4, produits.getPrix());
            stmt.setInt(5, produits.getId());
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

    
    
}
