package src.data_access;

import src.entity.User;
import src.use_case.trackedNutrients.TrackedNutrientsUserDataAccessInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryTrackedNutrientsDataAccessObject implements TrackedNutrientsUserDataAccessInterface {

    @Override
    public void saveTrackedNutrientsData(ArrayList<String> trackedNutrients, int userID) {
    }

    @Override
    public ArrayList<String> getUserTrackedNutrientsData(int userID) {
        return null;
    }

    @Override
    public Boolean existByUserID(int userID) {
        return true;
    }

    @Override
    public User getAccountByUserID(int userID) {
        return null;
    }
}
