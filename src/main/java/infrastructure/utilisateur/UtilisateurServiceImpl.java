package infrastructure.utilisateur;

import application.utilisateur.UtilisateurService;
import application.utilisateur.UtilisateurVO;
import domain.utilisateur.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    // Injection de dépendance

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    // Fin injection de dépendance

    /**
     * cette méthode est utilisé pour enregistrer un utilisateur
     *
     * @param utilisateurVO
     * @return
     */
    @Override
    public String save(UtilisateurVO utilisateurVO) {
        return null;
    }

    /**
     * cette méthode est utilisé pour mettre à jour un utilisateur
     *
     * @param utilisateurVO
     * @param uVoId
     * @return
     */
    @Override
    public String update(UtilisateurVO utilisateurVO, Long uVoId) {
        return null;
    }

    /**
     * cette méthode est utilisé pour authentifié un utilisateur
     *
     * @param utilisateurVO
     * @return
     */
    @Override
    public String log(UtilisateurVO utilisateurVO) {
        return null;
    }
}
