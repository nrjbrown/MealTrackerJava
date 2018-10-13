import java.util.ArrayList;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


class Meal {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    private final ArrayList<Food> Foods = new ArrayList<>();
    private final String Name;

    Meal (String name) {

        this.Name = name;
    }


    boolean isComplete(){
        boolean protein = false;
        boolean fat = false;
        boolean fruit = false;
        boolean vegetables = false;
        boolean beverage = false;

        for (Food food : this.Foods){
            switch(food.getCategory()){
                case Protein:
                    protein = true;
                    break;
                case Fat:
                    fat = true;
                    break;
                case Fruit:
                    fruit = true;
                    break;
                case Vegetable:
                    vegetables = true;
                    break;
                case Beverage:
                    beverage = true;
                    break;
            }
        }
        return fat && protein && vegetables && fruit;
    }

    double getCalories(){
        double calories = 0;

        for (Food food : this.Foods){
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.Foods) {
            fat += food.getFat();
        }

        return fat;
    }

    double getCarbs() {
        double carbs = 0;

        for (Food food : this.Foods) {
            carbs += food.getCarbs();
        }
        return carbs;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.Foods){
            protein += food.getProtein();
        }

        return protein;
    }

    String getName() {

        return this.Name;
    }

    String getMealTime() {
        return dtf.format(now);
    }


    void  addFood (Food food){

        this.Foods.add(food);
    }

    void viewFoods() {
        for (Food food : this.Foods){
            System.out.println(food.getName());
        }
    }
}