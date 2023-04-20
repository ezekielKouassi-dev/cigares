package application.utilisateur;

import java.util.Date;

public class UtilisateurVO {
    private Long id;

    private String nom;

    private String prenoms;

    private Date date_naissance;

    private String email;

    private String mot_de_passe;

    private Date dt_creation;

    private Date dt_mise_a_jour;

    private String status;

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public String getEmail() {
        return email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public Date getDt_creation() {
        return dt_creation;
    }

    public Date getDt_mise_a_jour() {
        return dt_mise_a_jour;
    }

    public String getStatus() {
        return status;
    }
}
