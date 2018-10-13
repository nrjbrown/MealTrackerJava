

import java.util.ArrayList;

class MealTracker {

    private final ArrayList<Meal> meals = new ArrayList<>();
    private final User thisUser;

    MealTracker (User user){

        this.thisUser = user;
    }

    boolean onTrack() {

        return this.getAdherence() >= this.thisUser.getTargetAdherence();
    }

    double getAdherence() {
        int count = 0 ;

        for (Meal meal : this.meals) {
            if (meal.isComplete()){
                count += 1;
            }
        }
        return count / this.meals.size() * 100;
    }

    int getMealCount() {

        return this.meals.size();
    }

    void addMeal(Meal meal){

        this.meals.add(meal);
    }

    void viewMeals() {
        for (Meal meal : this.meals) {
            System.out.println(meal.getName());
        }
    }
}
