package model;

public enum Ingrdientes {
    // crema, leche, chocolate
    CREMA("Crema"), LECHE("Leche"), CHOCOLATE("Chocolate");

    private String ingrediente;

    private Ingrdientes(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }
}
