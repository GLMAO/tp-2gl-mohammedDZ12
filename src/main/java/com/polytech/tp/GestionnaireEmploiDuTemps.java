package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: Notifier les observateurs
        notifyObservers("Un nouveau cours a été ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs
        notifyObservers("Cours modifié : " + message);
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void setChangement(String message) {
        // Correction pour passer le test TpTests
        notifyObservers(message);
    }
}
