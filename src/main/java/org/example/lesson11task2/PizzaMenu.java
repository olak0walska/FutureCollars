package org.example.lesson11task2;

import java.util.Arrays;
import java.util.List;

public class PizzaMenu {
    public static void main(String[] args) {
        List<Pizza> menu = Arrays.asList(
                new Pizza(false, Arrays.asList("salami", "pieczarki", "mozzarella"), 500, "ludowa"),
                new Pizza(true, Arrays.asList("cebula", "pomidor", "papryka"), 350, "przyjaźń"),
                new Pizza(false, Arrays.asList("salami, pomidor, papryka"), 450, "relax"),
                new Pizza(true, Arrays.asList("pieczarki", "mozzarella", "seler"), 375, "popularna"),
                new Pizza(true, Arrays.asList("pieczarki", "papryka", "cebula", "seler"), 475, "wyjazdowa"),
                new Pizza(true, Arrays.asList("seler", "papryka", "pieczarki"), 340, "swojska"),
                new Pizza(true, Arrays.asList("mozzarella", "papryka", "seler"), 345, "popularniejsza"),
                new Pizza(false, Arrays.asList("salami", "cebula", "seler"), 456, "cenzura"),
                new Pizza(false, Arrays.asList("salami", "pieczarki", "papryka"), 432, "obywatelska"),
                new Pizza(false, Arrays.asList("mozzarella", "pieczarki", "salami", "cebula", "pomidor", "papryka", "seler"), 678, "skladak")

        );

        menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .forEach(System.out::println);

        if (menu.stream()
                .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"))
                .findAny()
                .isPresent()) {
            System.out.println("W menu jest conajmniej jedna pozycja wegetariańska zawierająca pomidora i paprykę");
        } else {
            System.out.println("W menu nie ma żadnej pozycji wegetariańskiej zawierającej pomidora i paprykę");
        }

        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .forEach(System.out::println);

        if (menu.stream()
                .allMatch(pizza -> pizza.getIngredients().contains("mozzarella"))) {
            System.out.println("Wszystkie pozycje w menu zawierając mozzarellę");
        } else {
            System.out.println("Nie wszystkie pozycje w menu zawierają mozzarellę");
        }

        Pizza pizzaMax = menu.stream()
                .max((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Pizza o najwyższej kaloryczności: " + pizzaMax.getName());

        Pizza pizzaMin = menu.stream()
                .min((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Pizza o najniższej kaloryczności: " + pizzaMin.getName());
    }
}
