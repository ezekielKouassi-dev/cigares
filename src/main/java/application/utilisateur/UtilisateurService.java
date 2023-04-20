package application.utilisateur;

public interface UtilisateurService {
    public String save(UtilisateurVO utilisateurVO);

    public String update(UtilisateurVO utilisateurVO, Long uVoId);

    public String log(UtilisateurVO utilisateurVO);
}
