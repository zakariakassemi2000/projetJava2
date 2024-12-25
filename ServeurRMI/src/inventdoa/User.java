package inventdoa;

public class User {
    private int id;
    private String nom;
    private String categorie;
    private String quantite;
      private String prix;

    public User(int id, String nom, String categorie, String quantite, String prix) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.quantite = quantite;
        this.prix = prix;
    }

    public User() {
    }
    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getQuantite() {
        return quantite;
    }

    public String getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
      
      
}