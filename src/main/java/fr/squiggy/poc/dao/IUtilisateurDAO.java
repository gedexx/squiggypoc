package fr.squiggy.poc.dao;

import fr.squiggy.poc.bean.Utilisateur;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Nicolas on 30/05/2015.
 */
public interface IUtilisateurDAO {

    /**
     * Permet d'insérer un utilisateur
     *
     * @param utilisateur {@link fr.squiggy.poc.bean.Utilisateur}
     */
    void insert(Utilisateur utilisateur);

    /**
     * Permet de mettre à jour un utilisateur
     *
     * @param utilisateur {@link fr.squiggy.poc.bean.Utilisateur}
     */
    void update(Utilisateur utilisateur);

    /**
     * Permet de supprimer un utilisateur
     *
     * @param idUtilisateur Identifiant de l'utilisateur à supprimer
     */
    void delete(Long idUtilisateur);

    /**
     * Permet de récupérer tous les utilisateurs
     */
    List<Utilisateur> selectAll();

    /**
     * Permet de récupérer un utilisateur à partir de son identifiant
     *
     * @param idUtilisateur Identifiant de l'utilisateur à récupérer
     */
    Utilisateur selectUtilisateurById(Long idUtilisateur);


}
