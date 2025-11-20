package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
        // TODO: Ajouter d'autres fonctionnalités si nécessaire
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}
