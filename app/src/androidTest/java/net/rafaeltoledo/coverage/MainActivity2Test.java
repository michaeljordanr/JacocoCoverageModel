package net.rafaeltoledo.coverage;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivity2Test {

    @Rule
    public ActivityTestRule<MainActivity2> rule = new ActivityTestRule<>(MainActivity2.class);

    @Test
    public void shouldUpdateTextAfterButtonClick() {
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.button)).check(matches(not(isDisplayed())));
    }
}
