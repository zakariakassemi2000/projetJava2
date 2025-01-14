/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;

import java.awt.Color;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import dbcon.DBConnection;
import inventdoa.Produits;
import inventdoa.ProduitsDAO;
import service.RMIInterface;

/**
 *
 * @author CodingWithEliasLab
 */
public class CrudAppFrame extends javax.swing.JFrame {

    /**
     * Creates new form CrudAppFrame
     */
    // To track the selected user for update and delete
    private int selectedUserId = -1;
   
    
   public CrudAppFrame() {
    try {
        // Recherche du service distant avec le bon port
        RMIInterface look_up = (RMIInterface) Naming.lookup("rmi://localhost:1602/nn");

        // Initialisation de l'interface graphique
         initComponents();
         setVisible(true);

        // Chargement des données utilisateur
        loadUserData();

        System.out.println("Connexion au service RMI réussie.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la connexion au service RMI.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}

    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        firstNameTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA controle supmti");
        setBackground(new java.awt.Color(0, 255, 153));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  SYSTEME DE GESTION D'INVENTAIRE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOM");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CATEGORIE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUANTITE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRIX");

        addButton.setBackground(new java.awt.Color(204, 255, 255));
        addButton.setText("Ajouter ");
        addButton.setAlignmentY(0.0F);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(153, 255, 153));
        updateButton.setText("Update");
        updateButton.setAlignmentY(0.0F);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Supprimer ");
        deleteButton.setAlignmentY(0.0F);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        deleteButton1.setBackground(new java.awt.Color(255, 204, 204));
        deleteButton1.setText("Rechercher ");
        deleteButton1.setAlignmentY(0.0F);
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               deleteButton1ActionPerformed(evt);
            }
        });

        firstNameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/SUP1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(updateButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(deleteButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(32, 32, 32))
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton1)
                                .addGap(18, 18, 18)
                                .addComponent(firstNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)))))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(deleteButton1)
                    .addComponent(firstNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOM", "CATEGORIE", "QUANTITE", "PRIX"
            }
        ));
        usersTable.setPreferredSize(new java.awt.Dimension(790, 250));
        usersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        
    
    private void loadUserData() throws SQLException{
    	ProduitsDAO produitsDAO = new ProduitsDAO();
        List<Produits> users = produitsDAO.getUsers();
        String[][] data = new String[users.size()][5];
        
        for(int i=0; i < users.size(); i++){
           data[i][0] = String.valueOf(users.get(i).getId());
           data[i][1] = users.get(i).getNom();
           data[i][2] = users.get(i).getCategorie();
           data[i][3] = users.get(i).getQuantite();
           data[i][4] = users.get(i).getPrix();
        }
        String[] columnName = {"ID", "NOM", "CATEGORIE", "QUANTITE", "PRIX"};
        usersTable.setModel(new javax.swing.table.DefaultTableModel(data, columnName));
        
        
        
    }
    
    private void clearForm(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        emailTextField.setText("");
        countryTextField.setText("");
    }
  
    
    private void usersTableMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        int selectedRow =usersTable.getSelectedRow();
        if(selectedRow != -1){
            selectedUserId = Integer.parseInt(usersTable.getValueAt(selectedRow, 0).toString());
            firstNameTextField.setText(usersTable.getValueAt(selectedRow, 1).toString());
            lastNameTextField.setText(usersTable.getValueAt(selectedRow, 2).toString());
            emailTextField.setText(usersTable.getValueAt(selectedRow, 3).toString());
            countryTextField.setText(usersTable.getValueAt(selectedRow, 4).toString());
        }
    }                                       

    private void firstNameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

   
    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String searchText = firstNameTextField1.getText(); // Zone de texte pour la recherche

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter text to search", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; // Arrêter l'exécution si le texte est vide
        }

        // Réinitialisation du champ de texte
        firstNameTextField1.setText("");

        // Couleur de fond (correctement configurée)
        usersTable.setBackground(Color.YELLOW);

        // Liste pour stocker les utilisateurs
        List<Produits> users = new ArrayList<>();


        try (Connection connection = DBConnection.getConnection();
        	     PreparedStatement stmt = connection.prepareStatement("SELECT * FROM test WHERE nom LIKE ?")) {

        	    // Définir le paramètre dans la requête préparée
        	    stmt.setString(1, "%" + searchText + "%"); // Remplacez searchText par la valeur de recherche

        	    try (ResultSet rs = stmt.executeQuery()) { // Exécutez une seule fois
        	        while (rs.next()) {
        	            int id = rs.getInt("id");
        	            String nom = rs.getString("nom");
        	            String categorie = rs.getString("categorie");
        	            String quantite = rs.getString("quantite");
        	            String prix = rs.getString("prix");

        	            users.add(new Produits(id, nom, categorie, quantite, prix));
        	        }
        	    }
        	} catch (SQLException e) {
        	    JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        	    e.printStackTrace();
        	}

        // Mettre à jour l'interface utilisateur avec les données trouvées
        updateUsersTable(users);
    }

    // Méthode pour mettre à jour le tableau des utilisateurs
    private void updateUsersTable(List<Produits> users) {
        DefaultTableModel model = (DefaultTableModel) usersTable.getModel();
        model.setRowCount(0); // Effacer les lignes existantes

        for (Produits user : users) {
            model.addRow(new Object[]{user.getId(), user.getNom(), user.getCategorie(), user.getQuantite(), user.getPrix()});
        }
    }


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(selectedUserId != -1){
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if(confirmation == JOptionPane.YES_OPTION){
            	ProduitsDAO produitsDAO;
                try {
                	produitsDAO = new ProduitsDAO();
                	produitsDAO.deleteUser(selectedUserId);
                    JOptionPane.showMessageDialog(this, "User Deleted successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                    selectedUserId = -1;
                }catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error occurred while Deleting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "No User Selected for Delete ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

  

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();

        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {
            if(selectedUserId != -1){
            	Produits updateUser = new Produits(selectedUserId, fn, ln, email, country );
            	ProduitsDAO produitsDAO;
                try {
                	produitsDAO = new ProduitsDAO();
                    int res = produitsDAO.updateUser(updateUser);
                    if (res == 1) {
                        JOptionPane.showMessageDialog(this, "User updated successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                        this.clearForm();
                        loadUserData();
                        selectedUserId = -1;
                    }else {
                        JOptionPane.showMessageDialog(this, "Error occurred while Updatting ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error occurred while Updatting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else {
                JOptionPane.showMessageDialog(this, "No User Selected for update ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                            

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String fn = firstNameTextField.getText();
        String ln = lastNameTextField.getText();
        String email = emailTextField.getText();
        String country = countryTextField.getText();

        if(fn.isEmpty() || fn.isEmpty() || fn.isEmpty() || fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in all fields ", "Input Error", JOptionPane.ERROR_MESSAGE);
        }else {

        	Produits newUser = new Produits(0, fn, ln, email, country );
        	ProduitsDAO produitsDAO;
            try {
            	produitsDAO = new ProduitsDAO();
                int res = produitsDAO.insertProduits(newUser);
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "User created successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.clearForm();
                    loadUserData();
                }else {
                    JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error occurred while inserting ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }                                         

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField firstNameTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable usersTable;
    // End of variables declaration                   
}
