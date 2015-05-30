package fr.squiggy.poc.service.impl;

import fr.squiggy.poc.bean.Utilisateur;
import fr.squiggy.poc.dao.IUtilisateurDAO;
import fr.squiggy.poc.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nicolas on 30/05/2015.
 */
@Service("utilisateurService")
public class UtilisateurServiceImpl implements IUtilisateurService {

    @Autowired
    private IUtilisateurDAO utilisateurDAO;

    @Override
    @Transactional
    public void insert(Utilisateur utilisateur) {
        utilisateurDAO.insert(utilisateur);
    }

    @Override
    @Transactional
    public void update(Utilisateur utilisateur) {
        utilisateurDAO.update(utilisateur);
    }

    @Override
    @Transactional
    public void delete(Long idUtilisateur) {
        utilisateurDAO.delete(idUtilisateur);
    }

    @Override
    public List<Utilisateur> selectAll() {
        return utilisateurDAO.selectAll();
    }

    @Override
    public Utilisateur selectUtilisateurById(Long idUtilisateur) {
        return utilisateurDAO.selectUtilisateurById(idUtilisateur);
    }
}
