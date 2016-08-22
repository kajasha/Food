package it.morfoza.karo.food;

public class Food {

    private String name;
    private String ingredients;

    public Food(String name, String ingredients) {

        this.name = name;
        this.ingredients = ingredients;

    }

    public String toString() {
        return "Food:" + name + ingredients + ""; }


}
