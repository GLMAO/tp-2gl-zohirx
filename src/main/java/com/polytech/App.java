package com.polytech;

import com.polytech.tp.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        System.out.println("==========exercice 1==========");
        Cours cours1 = new CoursBuilder()
                .setMatiere("Génie Logiciel")
                .setEnseignant("Dr. Dupont")
                .setSalle("A101")
                .setDate("2024-11-20")
                .setHeureDebut("10:00")
                .setEstOptionnel(false)
                .setNiveau("Master")
                .setNecessiteProjecteur(true)
                .build();
        System.out.println(cours1.getDescription());

        System.out.println("==========exercice 2==========");
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        Etudiant etudiant1 = new Etudiant("Alice");
        Responsable responsable = new Responsable("M. Martin");

        gestionnaire.attach(etudiant1);
        gestionnaire.attach(responsable);


        gestionnaire.ajouterCours(cours1);


        System.out.println("==========exercice 3==========");
        ICours coursComplet = new CoursEnAnglais(new CoursEnLigne(cours1));
        System.out.println(coursComplet.getDescription());


    }
}
