import java.util.List;

public class SmartFridge {

    private Menu menu;
    public List<Product> getCurrent() {

        return null;
    }

    public List<Product> getMissing(Menu menu) {

        return null;
    }

    public Status setOrder(List<Product> products) {

        return Status.SUCCESS;
    }

    public Status addRecipe(Recipe recipe) {

        return Status.SUCCESS;
    }

    public Status setPeriod(Period period) {

        return Status.SUCCESS;
    }

    public Status addRecipeToMenu(Recipe recipe) {

        return menu.addRecipe(recipe);
    }

    public Status removeRecipeFromMenu(Recipe recipe) {

        return menu.removeRecipe(recipe);
    }

    public Status changeRecipePeriod(Recipe recipe, RecipePeriod period) {

        return Status.SUCCESS;
    }

    public FoodOrder orderFood(List<Product> products) {

        return null;
    }
}

enum Status {
    SUCCESS, FAILURE;
}