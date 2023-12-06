package src.interface_adapters.login;

import src.interface_adapters.logged_in.LoggedInState;
import src.interface_adapters.logged_in.LoggedInViewModel;
import src.interface_adapters.ViewManagerModel;
import src.interface_adapters.mealplan.MealPlanState;
import src.interface_adapters.mealplan.MealPlanViewModel;
import src.interface_adapters.preferences.PreferencesState;
import src.interface_adapters.preferences.PreferencesViewModel;
import src.interface_adapters.signup.SignupState;
import src.interface_adapters.trackedNutrients.TrackedNutrientsState;
import src.interface_adapters.trackedNutrients.TrackedNutrientsViewModel;
import src.use_case.login.LoginOutputBoundary;
import src.use_case.login.LoginOutputData;
import src.use_case.signup.SignupOutputBoundary;
import src.use_case.signup.SignupOutputData;
import src.view.TrackedNutrientsView;

public class LoginPresenter implements LoginOutputBoundary{
    private final LoginViewModel loginViewModel;
    private final LoggedInViewModel loggedInViewModel;
    private ViewManagerModel viewManagerModel;

    private final PreferencesViewModel preferencesViewModel;
    private final TrackedNutrientsViewModel trackedNutrientsViewModel;

    private final MealPlanViewModel mealPlanViewModel;

    public LoginPresenter(ViewManagerModel viewManagerModel,
                          LoggedInViewModel loggedInViewModel,
                          LoginViewModel loginViewModel,
                          PreferencesViewModel preferencesViewModel,
                          TrackedNutrientsViewModel trackedNutrientsViewModel, MealPlanViewModel mealPlanViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.loggedInViewModel = loggedInViewModel;
        this.loginViewModel = loginViewModel;
        this.preferencesViewModel = preferencesViewModel;
        this.trackedNutrientsViewModel = trackedNutrientsViewModel;
        this.mealPlanViewModel = mealPlanViewModel;
    }

    @Override
    public void prepareSuccessView(LoginOutputData response) {
        // On success, switch to the logged in view.

        LoggedInState loggedInState = loggedInViewModel.getState();
        PreferencesState preferencesState = preferencesViewModel.getState();
        TrackedNutrientsState trackedNutrientsState = trackedNutrientsViewModel.getState();
        MealPlanState mealPlanState = mealPlanViewModel.getState();
        loggedInState.setUsername(response.getUsername());
        loggedInState.setUserID(response.getUserID());
        preferencesState.setUserID(response.getUserID());
        trackedNutrientsState.setUserID(response.getUserID());
        mealPlanState.setId(response.getUserID());
        this.loggedInViewModel.setState(loggedInState);
        this.loggedInViewModel.firePropertyChanged();

        this.viewManagerModel.setActiveView(loggedInViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();

    }

    @Override
    public void prepareFailView(String error) {
        LoginState loginState = loginViewModel.getState();
        loginState.setUsernameError(error);
        loginViewModel.firePropertyChanged();
    }
}
