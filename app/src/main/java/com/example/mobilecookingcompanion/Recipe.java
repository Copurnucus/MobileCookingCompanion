package com.example.mobilecookingcompanion;

import java.util.ArrayList;

public class Recipe {
    String name;
    ArrayList<Ingredient> pantry;
    ArrayList<String> steps;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addIngredient(Ingredient ingredient) {
        pantry.add(ingredient);
    }

    public void setIngredient(int index, Ingredient ingredient) {
        pantry.set(index, ingredient);
    }

    public Ingredient getIngredient(int index) {
        return pantry.get(index);
    }

    public void removeIngredient(int index) {
        pantry.remove(index);
    }

    public void addStep(String step) {
        steps.add(step);
    }

    public void setStep(int index, String step) {
        steps.set(index, step);
    }

    public String getStep(int index) {
        return steps.get(index);
    }

    public void removeStep(int index) {
        steps.remove(index);
    }
}
