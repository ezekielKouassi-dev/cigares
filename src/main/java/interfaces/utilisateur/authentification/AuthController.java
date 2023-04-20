package interfaces.utilisateur.authentification;

import interfaces.utilisateur.UtilisateurFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    // Injection de dépendance

    @Autowired
    private UtilisateurFacade utilisateurFacade;

    // Fin Injection de dépendance
}
