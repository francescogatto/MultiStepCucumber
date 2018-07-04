package cucumber.cukeulator.test;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.cukeulator.CalculatorActivity;
import cucumber.cukeulator.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertNotNull;

/**
 * We use {@link ActivityTestRule} in order to have access to methods like getActivity
 * and getInstrumentation.
 * </p>
 * The CucumberOptions annotation is mandatory for exactly one of the classes in the test project.
 * Only the first annotated class that is found will be used, others are ignored. If no class is
 * annotated, an exception is thrown.
 * <p/>
 * The options need to at least specify features = "features". Features must be placed inside
 * assets/features/ of the test project (or a subdirectory thereof).
 */
public class CalculatorBisActivitySteps {

    /**
     * Since {@link CucumberRunner} and {@link cucumber.api.android.CucumberInstrumentationCore} have the control over the
     * test lifecycle, activity test rules must not be launched automatically. Automatic launching of test rules is only
     * feasible for JUnit tests. Fortunately, we are able to launch the activity in Cucumber's {@link Before} method.
     */
    @Rule
    ActivityTestRule rule = new ActivityTestRule<>(CalculatorActivity.class, false, false);

    /**
     * We launch the activity in Cucumber's {@link Before} hook.
     * See the notes above for the reasons why we are doing this.
     *
     * @throws Exception any possible Exception
     */
    @Before
    public void launchActivity() throws Exception {
        rule.launchActivity(null);
    }

    /**
     * All the clean up of application's data and state after each scenario must happen here
     */
    @After
    public void finishActivity() throws Exception {
        getActivity().finish();
    }

    /**
     * Gets the activity from our test rule.
     *
     * @return the activity
     */
    private Activity getActivity() {
        return rule.getActivity();
    }

    @Given("^I have a CalculatorActivity Test")
    public void I_have_a_CalculatorActivity_Test() {

        assertNotNull(getActivity());
    }

    @Then("^I should see the activity and continue with other test")
    public void I_should_see_the_activity_and_continue() {

    }

}
