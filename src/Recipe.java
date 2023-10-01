import java.util.List;

public class Recipe {
    private String name;
    private List<Product> ingredients;
    private String instructions;
    private RecipePeriod frequency;


    public Recipe(String name, List<Product> ingredients, String instructions, RecipePeriod frequency) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.frequency = frequency;
    }


    public String getName() {
        return name;
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public RecipePeriod getFrequency() {
        return frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<Product> ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setFrequency(RecipePeriod frequency) {
        this.frequency = frequency;
    }



    public Status addIngredient(Product product) {
        ingredients.add(product);
        return Status.SUCCESS;
    }

    public Status removeIngredient(Product product) {
        ingredients.remove(product);
        return Status.SUCCESS;
    }
}
