

class Test {


    public static void main(String[] args) {

        User David = new User("David", "Lapadula", "david@mail.com", 80);

        System.out.println("My name is " + David.getFirstName());

        System.out.println("My last name is " + David.getLastName());

        System.out.println("My email address is " + David.getEmail());

        System.out.println("My goal for complete meals is " + David.getTargetAdherence() + "%");

        System.out.println("---------------------------------------------------");


        Food Pizza = new Food ("Pizza", 25, 50, 10, Category.Fat);
        Food Pasta = new Food ("Pasta", 45, 70, 80, Category.Fat);
        Food Salad = new Food ("Salad", 10, 20, 10, Category.Vegetable);

        System.out.println("One of the foods I am eating in this meal is " + Pizza.getName());

        Pizza.addCategory(Fat);

        System.out.println("The main food group for Pizza is " + Pizza.getCategory());

        System.out.println("Pizza has " + Pizza.getCalories() + " calories");

        System.out.println("Pizza has " + Pizza.getCarbs() + " grams of carbohydrates");

        System.out.println("Pizza has " + Pizza.getFat()+ " grams of fat");

        System.out.println("Pizza has " + Pizza.getProtein() + " grams of protein");

        System.out.println("---------------------------------------------------");

        Meal meal = new Meal("Dinner");

        meal.addFood(Pizza);
        meal.addFood(Pasta);
        meal.addFood(Salad);

        System.out.println("This meal is called " + meal.getName());
        System.out.println("This meal consists of");
        meal.viewFoods();

        System.out.println("---------------------------------------------------");

        System.out.println("I am eating Dinner at " + meal.getMealTime());
        System.out.println("Dinner has " + meal.getCalories() + " calories");
        System.out.println("Dinner has " + meal.getCarbs() + " carbs");
        System.out.println("Dinner has " + meal.getProtein() + " protein");
        System.out.println("Dinner has " + meal.getFat() + " fat");

        if (meal.isComplete() == true) {
            System.out.println("Dinner is complete");
        } else {
            System.out.println("Dinner is not complete");
        }

        System.out.println("---------------------------------------------------");

        MealTracker Monday = new MealTracker(David);
        Monday.addMeal(meal);

        System.out.println("My meals for the day include");
        Monday.viewMeals();

        if (Monday.onTrack() == true) {
            System.out.println("This meal is keeping me on track");
        } else {
            System.out.println("I am not currently on track for my daily eating needs");
        }

        System.out.println("Today I have eaten a total of " + Monday.getMealCount() + " meals");
        System.out.println("Today I had a total of " + Monday.getAdherence() + " complete meals");



    }

}