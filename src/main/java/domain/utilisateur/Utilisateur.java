package domain.utilisateur;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenoms;

    private Date date_naissance;

    private String email;

    private String mot_de_passe;

    private Date dt_creation;

    private Date dt_mise_a_jour;

    private String status;

    public Utilisateur() {
    }

    public Utilisateur(Long id, String nom, String prenoms, Date date_naissance, String email, String mot_de_passe, Date dt_creation, Date dt_mise_a_jour, String status) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.date_naissance = date_naissance;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
        this.dt_creation = dt_creation;
        this.dt_mise_a_jour = dt_mise_a_jour;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public Date getDt_creation() {
        return dt_creation;
    }

    public void setDt_creation(Date dt_creation) {
        this.dt_creation = dt_creation;
    }

    public Date getDt_mise_a_jour() {
        return dt_mise_a_jour;
    }

    public void setDt_mise_a_jour(Date dt_mise_a_jour) {
        this.dt_mise_a_jour = dt_mise_a_jour;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
