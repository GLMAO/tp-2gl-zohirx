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
        System.out.println(cours1.getMatiere());
    }
}
