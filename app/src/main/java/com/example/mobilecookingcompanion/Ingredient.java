package com.example.mobilecookingcompanion;

import java.time.LocalDate;

public class Ingredient {
    String name;
    float quantity;
    String unitOfQuantity;
    LocalDate expirationDate;

    public Ingredient(String name, float quantity, String unitOfQuantity, LocalDate expirationDate) {
        this.name= name;
        this.quantity = quantity;
        this.unitOfQuantity = unitOfQuantity;
        this.expirationDate = expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setUnitOfQuantity(String unitOfQuantity) {
        this.unitOfQuantity = unitOfQuantity;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getUnitOfQuantity() {
        return unitOfQuantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void delete(Ingredient ingredient) {
        ingredient = null;
    }
}
