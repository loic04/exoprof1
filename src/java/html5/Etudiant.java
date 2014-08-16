package html5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;

/**
 * Simple bean for storing form field values.
 */
@ManagedBean
@SessionScoped
public class Etudiant implements Serializable {
    
    private String nom = "";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

     private String prenom = "";

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    private String naissance = "";

    public String getNaissance() {
        return naissance;
    }

    public void setNaissance(String naissance) {
        this.naissance = naissance;
    }
    
    private String moyenne = "";

    public String getMoyenne() {
        return moyenne;
    }

    public void setmoyenne(String moyenne) {
        this.moyenne = moyenne;
    }
    

}

