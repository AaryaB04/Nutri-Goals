package src.entity;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonRecipe implements Recipe {

    private final int recipeID;

    private final String recipeName;

    private final List<Ingredient> recipeIngredients;

    private final String recipeInstructions;

    private final String recipeType;
<<<<<<< HEAD

    private final HashMap<String, Double> nutritionalInfo;

    private final String recipeLink;


    public CommonRecipe(int recipeID, String recipeName, List<Ingredient> recipeIngredients,
                        String recipeInstructions, String recipeType, HashMap<String, Double> nutritionalInfo,
                        String recipeLink) {
        this.recipeID = recipeID;
=======

    private final HashMap<String, Float> nutritionalinfo;

    private final String recipelink;


    public CommonRecipe(int recipeId, String recipeName, List<Ingredient> recipeIngredients,
                        String recipeInstructions, String recipeType, HashMap<String, Float> nutritionalinfo, String recipelink) {




        this.recipeId = recipeId;
>>>>>>> main
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
        this.recipeType = recipeType;
<<<<<<< HEAD
        this.nutritionalInfo = nutritionalInfo;
        this.recipeLink = recipeLink;
=======


        this.nutritionalinfo = nutritionalinfo;
        this.recipelink = recipelink;
>>>>>>> main

    }

    @Override
    public int getRecipeID() {
        return recipeID;
    }

    @Override
    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public List<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }



    @Override
    public String getRecipeInstructions() {
        return recipeInstructions;
    }

    @Override
<<<<<<< HEAD
    public String getRecipeType() {
=======
    public String getrecipeType() {
>>>>>>> main
        return recipeType;
    }

    @Override
<<<<<<< HEAD
    public HashMap<String, Double> getNutritionalInfo() {
        return nutritionalInfo;
    }

    @Override
    public String getRecipeLink() {
        return recipeLink;
=======
    public HashMap<String, Float> getnutritionalinfo() {
        return nutritionalinfo;
    }


    @Override
    public String getnutritionalinfostring(){return nutritionalinfo.toString();}

    @Override
    public String getrecipelink() {
        return recipelink;
    }

    @Override
    public String getrecipeIngredientstring() {

        StringBuilder sb = new StringBuilder();
        for (int i =0; i < this.recipeIngredients.size(); i ++ ){

            Ingredient ingredient = recipeIngredients.get(i);
            String ingredientstring = ingredient.getName() + "amount : " + ingredient.getAmount() + ", ";
            sb.append(ingredientstring);

        }
        return sb.toString();
    }

    @Override
    public HashMap<String, Float> getNutritionalInfo() {
        return this.nutritionalinfo;
>>>>>>> main
    }


//    @Override
//    public HashMap<Integer, HashMap<String, ArrayList<String>>> savedRecipes() {
//        return savedRecipes;
//    }
}