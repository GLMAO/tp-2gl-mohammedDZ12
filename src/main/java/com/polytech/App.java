package com.polytech;

import com.polytech.tp.*;

public class App
{
    public static void main(String[] args)
    {

        // ============================
        // EXERCICE 1 : Builder
        // ============================
        CoursBuilder builder = new CoursBuilder();

        Cours cours1 = builder
                .setMatiere("Algorithmique Avancée")
                .setEnseignant("Mme awatif")
                .setSalle("B21")
                .setDate("Lundi")
                .setHeureDebut("10h00")
                .setEstOptionnel(true)
                .setNiveau("3A")
                .setNecessiteProjecteur(false)
                .build();

        Cours cours2 = builder
                .setMatiere("Bases de Données")
                .setEnseignant("Mr Khaled")
                .setSalle("C10")
                .setDate("Mercredi")
                .setHeureDebut("14h00")
                .setEstOptionnel(false)
                .setNiveau("2A")
                .setNecessiteProjecteur(true)
                .build();

        System.out.println("Cours construit 1 : " + cours1.getDescription());
        System.out.println("Cours construit 2 : " + cours2.getDescription());

        // ============================
        // EXERCICE 3 : OBSERVER
        // ============================
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        Etudiant etu1 = new Etudiant("Ahmed");
        Etudiant etu2 = new Etudiant("Sara");
        Responsable resp = new Responsable("Dr Yasmine");

        gestionnaire.attach(etu1);
        gestionnaire.attach(etu2);
        gestionnaire.attach(resp);

        System.out.println("\nAjout des cours :");
        gestionnaire.ajouterCours(cours1);
        gestionnaire.ajouterCours(cours2);

        System.out.println("\nChangement de cours :");
        gestionnaire.setChangement("Modification du créneau horaire : 15h00 - 16h30");

        // ============================
        // EXERCICE 2 : DECORATOR
        // ============================
        System.out.println("\nDécoration du cours (En ligne) :");
        ICours coursEnLigne1 = new CoursEnLigne(cours1);
        ICours coursEnLigne2 = new CoursEnLigne(cours2);

        System.out.println("Description du cours décoré 1 : " + coursEnLigne1.getDescription());
        System.out.println("Durée du cours décoré 1 : " + coursEnLigne1.getDuree() + "h");

        System.out.println("Description du cours décoré 2 : " + coursEnLigne2.getDescription());
        System.out.println("Durée du cours décoré 2 : " + coursEnLigne2.getDuree() + "h");
    }
}
